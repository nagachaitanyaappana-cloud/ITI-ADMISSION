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

   public List<Object[]> getImplantReportByIndustry(Integer industryId) {

    String sql = """
        SELECT
            i.implant_id,
            ind.industry_id,
            ind.industry_name,
            i.faculty_name,
            i.trade_short,
            i.industry_address,
            i.hr_no,
            i.from_date,
            i.to_date,
            i.no_of_days,
            i.no_of_students,
            i.location,
            i.description
        FROM implant.implant i
        JOIN implant.industries ind
            ON i.iti_code = CAST(ind.iti_code AS VARCHAR)
           AND i.trade_short = ind.trade_short
        WHERE ind.industry_id = ?
        """;

    return jdbcTemplate.query(
            sql,
            (rs, rowNum) -> new Object[]{
                    rs.getLong("implant_id"),
                    rs.getLong("industry_id"),
                    rs.getString("industry_name"),
                    rs.getString("faculty_name"),
                    rs.getString("trade_short"),
                    rs.getString("industry_address"),
                    rs.getLong("hr_no"),
                    rs.getDate("from_date"),
                    rs.getDate("to_date"),
                    rs.getInt("no_of_days"),
                    rs.getInt("no_of_students"),
                    rs.getString("location"),
                    rs.getString("description")
            },
            industryId
    );
}
    
}