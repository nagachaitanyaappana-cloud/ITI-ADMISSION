package com.server.backend.service.Implant;

import com.server.backend.DTO.Implant.ImplantCreateRequest;
import com.server.backend.DTO.Implant.ImplantResponse;
import com.server.backend.DTO.Implant.InplantDashboardResponse;
import java.util.List;

public interface ImplantService {
    InplantDashboardResponse getInplantDashboardDetails();
    ImplantResponse createImplant(ImplantCreateRequest request);

    List<ImplantResponse> getAllImplants();

    ImplantResponse getImplantById(Long implantId);
    List<Object[]> getItis();
    List<Object[]> getIndustries(Integer itiCode);
    List<ImplantResponse> getReport(String itiCode);
}
