package com.server.backend.service.Placements;

import com.server.backend.DTO.Placements.PlacementsDistinctItiResponse;
import com.server.backend.DTO.Placements.PlacementsGroupedResponse;
import com.server.backend.DTO.Placements.PlacementsOverviewResponse;
import java.util.List;
import java.util.Map;

public interface PlacementsService {
    PlacementsOverviewResponse getOverviewDetails();
    PlacementsGroupedResponse getCountPlacementsGroupedByPtype();
    PlacementsDistinctItiResponse getDistinctItiCodesByPtype();

    List<Map<String, Object>> getSchedulewiseDistrictData(String year);
    List<Map<String, Object>> getSchedulewiseItiData(String year, String distCode);
    List<Map<String, Object>> getSchedulewisePlacementDetails(String plcmtId);

    List<Map<String, Object>> getDatewiseScheduleData(String fromDate, String toDate, String ptype);

    List<Map<String, Object>> getStatePlacementReport();

    List<Map<String, Object>> getDistrictPlacementReport(String distCode);

    List<Map<String, Object>> getYearwisePlacementReport();

    List<Map<String, Object>> getYearwisePlacementDetails(String year);

    List<String> getDistinctAdmissionYears();

    List<Map<String, Object>> getStateSkillDevelopmentPlanReport(String year);
}
