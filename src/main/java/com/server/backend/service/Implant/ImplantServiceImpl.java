package com.server.backend.service.Implant;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.server.backend.DTO.Implant.InplantDashboardResponse;

@Service
public class ImplantServiceImpl implements ImplantService {

    private final JdbcTemplate jdbcTemplate;

    public ImplantServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public InplantDashboardResponse getInplantDashboardDetails() {
        InplantDashboardResponse response = new InplantDashboardResponse();

        response.setInplantTotal(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM implant.implant", Long.class));
        response.setInplantDistinctItis(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT iti_code) FROM implant.implant", Long.class));
        response.setInplantDistinctSlnos(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT slno) FROM implant.implant", Long.class));

        response.setIndustriesTotal(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM implant.industries", Long.class));
        response.setIndustriesDistinctItis(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT iti_code) FROM implant.industries", Long.class));
        response.setIndustriesDistinctIndustries(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT industry_id) FROM implant.industries", Long.class));
        response.setIndustriesDistinctTrades(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT trade_code) FROM implant.industries", Long.class));

        response.setIndustryMasterTotal(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM implant.industry_master", Long.class));
        response.setIndustryMasterMajor(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM implant.industry_master WHERE industry_type = 'Major'", Long.class));
        response.setIndustryMasterMinor(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM implant.industry_master WHERE industry_type = 'Minor'", Long.class));

        response.setSumOfStudent(jdbcTemplate.queryForObject("SELECT COALESCE(SUM(no_of_students), 0) FROM implant.implant", Long.class));

        return response;
    }
}
