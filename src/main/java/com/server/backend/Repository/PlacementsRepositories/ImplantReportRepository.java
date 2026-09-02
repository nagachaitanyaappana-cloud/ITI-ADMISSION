package com.server.backend.Repository.PlacementsRepositories;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImplantReportRepository {

    private final JdbcTemplate jdbcTemplate;

    public ImplantReportRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Object[]> getIndustries(Integer itiCode) {

        String sql = """
            SELECT DISTINCT industry_id, industry_name
            FROM implant.industries
            WHERE iti_code = ?
            ORDER BY industry_name
            """;

        return jdbcTemplate.query(
                sql,
                (rs, rowNum) -> new Object[]{
                        rs.getLong("industry_id"),
                        rs.getString("industry_name")
                },
                itiCode
        );
    }
}