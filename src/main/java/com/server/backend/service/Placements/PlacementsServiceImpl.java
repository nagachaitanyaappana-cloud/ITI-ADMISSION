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

    @Override
    public List<Map<String, Object>> getSchedulewiseDistrictData(String year) {
        String sql = "SELECT s.dist_code AS \"distCode\", COALESCE(d.dist_name, s.dist_code) AS \"distName\", "
                   + "COUNT(*) FILTER (WHERE s.schedule_type ILIKE '%job%') AS \"jobSchedules\", "
                   + "COUNT(*) FILTER (WHERE s.schedule_type ILIKE '%appre%') AS \"apprenticeshipSchedules\", "
                   + "COUNT(*) AS \"totalSchedules\" "
                   + "FROM placements.placements_schedules s "
                   + "LEFT JOIN public2.dist_mst d ON d.dist_code = s.dist_code "
                   + "WHERE s.schedule_date LIKE ? "
                   + "GROUP BY s.dist_code, COALESCE(d.dist_name, s.dist_code) "
                   + "ORDER BY \"distName\"";
        return jdbcTemplate.queryForList(sql, year + '%');
    }

    @Override
    public List<Map<String, Object>> getSchedulewiseItiData(String year, String distCode) {
        String sql = "SELECT s.plcmt_id AS id, COALESCE(i.iti_name, s.schedule_location) AS itiName, "
                   + "s.schedule_type AS type, s.schedule_date AS date, s.schedule_desc AS description, "
                   + "s.no_of_vacancies AS vacancies, s.no_of_attended_candidates AS attended, "
                   + "s.no_of_selected_candidates AS selected, "
                   + "(SELECT COUNT(*) FROM placements.placements p WHERE p.plcmt_id = s.plcmt_id) AS recordsCount "
                   + "FROM placements.placements_schedules s "
                   + "LEFT JOIN public2.iti i ON i.iti_code = s.schedule_location "
                   + "WHERE s.schedule_date LIKE ? AND s.dist_code = ? "
                   + "ORDER BY s.plcmt_id";
        return jdbcTemplate.queryForList(sql, year + '%', distCode);
    }

    @Override
    public List<Map<String, Object>> getSchedulewisePlacementDetails(String plcmtId) {
        String sql = "SELECT p.name, p.adm_num AS admNum, p.iti_name AS itiName, "
                   + "p.dist_name AS distName, p.ptype, p.pname_of_company AS company, "
                   + "p.ppostname AS post, p.psalary AS salary, p.ptrade AS trade, "
                   + "p.schedule_id AS scheduleId, p.plcmt_year AS yr "
                   + "FROM placements.placements p WHERE p.plcmt_id = ? ORDER BY p.name";
        return jdbcTemplate.queryForList(sql, Long.valueOf(plcmtId));
    }

    @Override
    public List<Map<String, Object>> getDatewiseScheduleData(String fromDate, String toDate, String ptype) {
        StringBuilder sql = new StringBuilder(
            "SELECT s.plcmt_id AS \"scheduleId\", s.schedule_date AS \"date\", "
          + "s.dist_code AS \"distCode\", COALESCE(d.dist_name, s.dist_code) AS \"distName\", "
          + "COALESCE(i.iti_name, s.schedule_location) AS \"itiName\", "
          + "s.schedule_type AS \"type\", s.schedule_desc AS \"description\", "
          + "s.no_of_vacancies AS \"vacancies\", s.no_of_attended_candidates AS \"attended\", "
          + "s.no_of_selected_candidates AS \"selected\", "
          + "(SELECT COUNT(*) FROM placements.placements p WHERE p.plcmt_id = s.plcmt_id) AS \"recordsCount\" "
          + "FROM placements.placements_schedules s "
          + "LEFT JOIN public2.dist_mst d ON d.dist_code = s.dist_code "
          + "LEFT JOIN public2.iti i ON i.iti_code = s.schedule_location "
          + "WHERE s.schedule_date BETWEEN ? AND ? ");
        List<Object> params = new java.util.ArrayList<>(java.util.List.of(fromDate, toDate));
        if (ptype != null && !ptype.isBlank()) {
            sql.append("AND s.schedule_type = ? ");
            params.add(ptype);
        }
        sql.append("ORDER BY s.schedule_date, s.plcmt_id");
        return jdbcTemplate.queryForList(sql.toString(), params.toArray());
    }

    /** ptype column mapping: Job=CAMPUS PLACEMENT, OJ=DIRECT PLACEMENT, Apprenticeship=APPRENTICESHIP,
     *  OA=DIRECT APPRENTICESHIP, SelfEmployment=SELF EMPLOYMENT, HigherEducation=HIGHER EDUCATION */
    private static final String PTYPE_COUNTS =
          "COUNT(*) FILTER (WHERE UPPER(TRIM(p.ptype)) = 'JOB') AS \"campusPlacement\", "
        + "COUNT(*) FILTER (WHERE UPPER(TRIM(p.ptype)) = 'OJ') AS \"directPlacement\", "
        + "COUNT(*) FILTER (WHERE UPPER(TRIM(p.ptype)) = 'APPRENTICESHIP') AS \"apprenticeship\", "
        + "COUNT(*) FILTER (WHERE UPPER(TRIM(p.ptype)) = 'OA') AS \"directApprenticeship\", "
        + "COUNT(*) FILTER (WHERE UPPER(TRIM(p.ptype)) = 'SELFEMPLOYMENT') AS \"selfEmployment\", "
        + "COUNT(*) FILTER (WHERE UPPER(TRIM(p.ptype)) = 'HIGHEREDUCATION') AS \"higherEducation\", "
        + "COUNT(*) AS \"total\" ";

    @Override
    public List<Map<String, Object>> getStatePlacementReport() {
        String sql = "SELECT p.dist_code AS \"distCode\", COALESCE(d.dist_name, p.dist_code) AS \"distName\", "
                   + PTYPE_COUNTS
                   + "FROM placements.placements p "
                   + "LEFT JOIN public2.dist_mst d ON d.dist_code = p.dist_code "
                   + "GROUP BY p.dist_code, COALESCE(d.dist_name, p.dist_code) "
                   + "ORDER BY \"distName\"";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public List<Map<String, Object>> getDistrictPlacementReport(String distCode) {
        String sql = "SELECT COALESCE(NULLIF(TRIM(p.iti_name), ''), p.iti_code) AS \"itiName\", "
                   + "p.plcmt_year AS \"year\", "
                   + PTYPE_COUNTS
                   + "FROM placements.placements p "
                   + "WHERE p.dist_code = ? "
                   + "GROUP BY COALESCE(NULLIF(TRIM(p.iti_name), ''), p.iti_code), p.plcmt_year "
                   + "ORDER BY \"itiName\", \"year\" DESC";
        return jdbcTemplate.queryForList(sql, distCode);
    }

    @Override
    public List<Map<String, Object>> getYearwisePlacementReport() {
        String sql = "SELECT p.plcmt_year AS \"year\", "
                   + PTYPE_COUNTS
                   + "FROM placements.placements p "
                   + "WHERE p.plcmt_year IS NOT NULL AND p.plcmt_year <> '' "
                   + "GROUP BY p.plcmt_year "
                   + "ORDER BY \"year\" DESC";
        return jdbcTemplate.queryForList(sql);
    }

    @Override
    public List<Map<String, Object>> getYearwisePlacementDetails(String year) {
        String sql = "SELECT p.dist_code AS \"distCode\", COALESCE(d.dist_name, p.dist_code) AS \"distName\", "
                   + PTYPE_COUNTS
                   + "FROM placements.placements p "
                   + "LEFT JOIN public2.dist_mst d ON d.dist_code = p.dist_code "
                   + "WHERE p.plcmt_year = ? "
                   + "GROUP BY p.dist_code, COALESCE(d.dist_name, p.dist_code) "
                   + "ORDER BY \"distName\"";
        return jdbcTemplate.queryForList(sql, year);
    }

    @Override
    public List<String> getDistinctAdmissionYears() {
        String sql = "SELECT DISTINCT year_of_admission FROM admissions.iti_admissions "
                   + "WHERE year_of_admission IS NOT NULL ORDER BY year_of_admission DESC";
        return jdbcTemplate.queryForList(sql, String.class);
    }

    /** State Skill Development Plan report: trade-wise seats, admissions (gender split) and placements
     *  for an admission year. Seats come from public.iti_seatmatrix (hstore strength),
     *  admissions from admissions.iti_admissions, placements from placements.placements (all years). */
    @Override
    public List<Map<String, Object>> getStateSkillDevelopmentPlanReport(String year) {
        String sql = "SELECT tm.trade_name AS \"tradeName\", "
                   + "COUNT(DISTINCT a.iti_code) AS \"itiCount\", "
                   + "COALESCE(sm.total_strength, 0) AS \"totalStrength\", "
                   + "COUNT(*) FILTER (WHERE UPPER(a.gender) LIKE 'M%') AS \"totalMale\", "
                   + "COUNT(*) FILTER (WHERE UPPER(a.gender) LIKE 'F%') AS \"totalFemale\", "
                   + "COUNT(*) AS \"totalGender\", "
                   + "COALESCE(pl.plcmts, 0) AS \"totalPlcmts\" "
                   + "FROM admissions.iti_admissions a "
                   + "JOIN public.ititrade_master tm ON a.trade_code = tm.trade_code "
                   + "LEFT JOIN (SELECT trade_code, SUM(seat_value) AS total_strength "
                   + "          FROM (SELECT trade_code, (svals(strength))::int AS seat_value "
                   + "                FROM public.iti_seatmatrix WHERE year = ?) sv "
                   + "          GROUP BY trade_code) sm "
                   + "          ON sm.trade_code = tm.trade_code "
                   + "LEFT JOIN (SELECT trade_code, COUNT(*) AS plcmts "
                   + "          FROM placements.placements GROUP BY trade_code) pl "
                   + "          ON pl.trade_code::text = tm.trade_code::text "
                   + "WHERE a.year_of_admission::text = ?::text "
                   + "GROUP BY tm.trade_name, sm.total_strength, pl.plcmts "
                   + "ORDER BY \"tradeName\"";
        return jdbcTemplate.queryForList(sql, year, year);
    }
}
