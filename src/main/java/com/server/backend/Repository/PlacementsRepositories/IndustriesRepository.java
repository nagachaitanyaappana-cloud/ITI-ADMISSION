package com.server.backend.Repository.PlacementsRepositories;
import com.server.backend.entity.Placements.Industries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface IndustriesRepository extends JpaRepository<Industries, Long> {

    List<Industries> findByItiCode(Integer itiCode);
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
    @Query("""
    SELECT DISTINCT i
    FROM Industries i
    WHERE i.itiCode = :itiCode
    ORDER BY i.industryName
""")
List<Industries> findDistinctIndustriesByItiCode(
        @Param("itiCode") Integer itiCode);
}