package com.server.backend.service.Placements;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

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

        PlacementsOverviewResponse response = new PlacementsOverviewResponse();
        response.setAllPlacement(placementsCount);
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
}
