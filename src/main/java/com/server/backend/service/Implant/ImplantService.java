package com.server.backend.service.Implant;
import com.server.backend.DTO.Implant.ImplantCreateRequest;
import com.server.backend.DTO.Implant.ImplantResponse;
import com.server.backend.DTO.Implant.InplantDashboardResponse;
import java.util.List;
import java.util.Map;
import com.server.backend.DTO.Implant.ImplantReportResponse;
public interface ImplantService {
    InplantDashboardResponse getInplantDashboardDetails();
    ImplantResponse createImplant(ImplantCreateRequest request);

    List<ImplantResponse> getAllImplants();
   
    ImplantResponse getImplantById(Long implantId);
    List<Object[]> getItis();
    List<Object[]> getIndustries(Integer itiCode);
    List<ImplantReportResponse> getReport(String itiCode);
    List<Object[]> getDistrictItis(String distCode);
    List<ImplantReportResponse> getDistrictReport(String itiCode, Integer industryId);
    List<Map<String, Object>> getStates();
    List<Map<String, Object>> getDistrictsByState(String stateCode);
    ImplantResponse updateImplant(Long implantId, ImplantCreateRequest request);
    void deleteImplant(Long implantId);
}
