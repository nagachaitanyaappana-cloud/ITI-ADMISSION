package com.server.backend.Repository.PlacementsRepositories;
import com.server.backend.entity.Placements.Industries;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IndustriesRepository extends JpaRepository<Industries, Long> {

    @Query(value = """
        SELECT DISTINCT iti_code, iti_name
        FROM implant.industries
        ORDER BY iti_name
        """, nativeQuery = true)
    List<Object[]> getItis();

    @Query(value = """
        SELECT DISTINCT industry_id, industry_name
        FROM implant.industries
        WHERE iti_code = :itiCode
        ORDER BY industry_name
        """, nativeQuery = true)
    List<Object[]> getIndustries(@Param("itiCode") Integer itiCode);
      List<Industries> findByItiCode(Integer itiCode);
      Boolean existsByItiCodeAndIndustryIdAndTradeCode(
              Integer itiCode, Long industryId, Integer tradeCode
      );
@Query(value = """
    SELECT
        i.implant_id,
        it.iti_name,
        ind.industry_name,
        i.faculty_name,
        ind.trade_name,
        i.industry_address,
        i.hr_no,
        i.from_date,
        i.to_date,
        i.no_of_days,
        i.no_of_students,
        sm.statename,
        dm.dist_name,
        i.location,
        i.description
    FROM implant.implant i

    JOIN implant.industries ind
        ON CAST(i.iti_code AS INTEGER) = ind.iti_code
       AND i.trade_short = ind.trade_short

    JOIN iti it
        ON i.iti_code = it.iti_code

    LEFT JOIN dist_mst dm
        ON it.dist_code = dm.dist_code

    LEFT JOIN states_mast sm
        ON dm.statecode = sm.statecode

    WHERE i.iti_code = :itiCode

    ORDER BY i.implant_id
    """, nativeQuery = true)
List<Object[]> getReportData(@Param("itiCode") Integer itiCode);}  