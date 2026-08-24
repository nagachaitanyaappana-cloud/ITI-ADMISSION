package com.server.backend.service.Placements;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.server.backend.DTO.Placements.InplantDashboardResponse;
import com.server.backend.DTO.Placements.LabsDashboardResponse;
import com.server.backend.DTO.Placements.PlacementsDistinctItiResponse;
import com.server.backend.DTO.Placements.PlacementsGroupedResponse;
import com.server.backend.DTO.Placements.PlacementsOverviewResponse;

@Service
public class PlacementsServiceImpl implements PlacementsService {

    private final JdbcTemplate jdbcTemplate;

    public PlacementsServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public PlacementsOverviewResponse getOverviewDetails() {
        long placementsCount = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM placements.placements", Long.class);
        long implantCount = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM implant.implant", Long.class);
        long labsCount = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM labs.labs", Long.class);

        PlacementsOverviewResponse response = new PlacementsOverviewResponse();
        response.setAllPlacement(placementsCount);
        response.setAllImplants(implantCount);
        response.setAllLabs(labsCount);
        return response;
    }

    @Override
    public PlacementsGroupedResponse getCountPlacementsGroupedByPtype() {
        String sql = "SELECT ptype, COUNT(*) FROM placements.placements GROUP BY ptype ORDER BY ptype";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        PlacementsGroupedResponse response = new PlacementsGroupedResponse();
        for (Map<String, Object> row : rows) {
            String ptype = (String) row.get("ptype");
            Long count = (Long) row.get("count");
            if (ptype == null || count == null) continue;
            switch (ptype.trim().toLowerCase()) {
                case "job" -> response.setJob(count);
                case "oj" -> response.setOA(count);
                case "apprenticeship" -> response.setApprenticeship(count);
                case "oa" -> response.setOA(count);
                case "highereducation" -> response.setHigherEducation(count);
                case "selfemployment" -> response.setSelfEmployment(count);
            }
        }
        return response;
    }

    @Override
    public PlacementsDistinctItiResponse getDistinctItiCodesByPtype() {
        String sql = "SELECT ptype, COUNT(DISTINCT iti_code) as iti_count FROM placements.placements GROUP BY ptype ORDER BY ptype";
        List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);

        PlacementsDistinctItiResponse response = new PlacementsDistinctItiResponse();
        for (Map<String, Object> row : rows) {
            String ptype = (String) row.get("ptype");
            Long count = ((Number) row.get("iti_count")).longValue();
            if (ptype == null) continue;
            switch (ptype.trim().toLowerCase()) {
                case "job" -> response.setJobItisCount(count);
                case "oj" -> response.setOjItisCount(count);
                case "apprenticeship" -> response.setApprenticeshipItisCount(count);
                case "oa" -> response.setOaItisCount(count);
                case "highereducation" -> response.setHigherEducationItisCount(count);
                case "selfemployment" -> response.setSelfEmploymentItisCount(count);
            }
        }
        return response;
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

    @Override
    public LabsDashboardResponse getLabsDashboardDetails() {
        LabsDashboardResponse response = new LabsDashboardResponse();

        response.setLabsTotal(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM labs.labs", Long.class));
        response.setLabsDistinctItis(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT iti_code) FROM labs.labs", Long.class));
        response.setLabsDistinctTrades(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT trade_short) FROM labs.labs", Long.class));
        response.setLabItemsTotal(jdbcTemplate.queryForObject("SELECT COUNT(*) FROM labs.labitems", Long.class));
        response.setLabItemsDistinctItems(jdbcTemplate.queryForObject("SELECT COUNT(DISTINCT item_name) FROM labs.labitems", Long.class));

        return response;
    }
}
