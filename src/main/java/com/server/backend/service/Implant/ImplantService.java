package com.server.backend.service.Implant;

import com.server.backend.DTO.Implant.ImplantCreateRequest;
import com.server.backend.DTO.Implant.ImplantResponse;
import com.server.backend.DTO.Implant.InplantDashboardResponse;
import java.util.List;

public interface ImplantService {
    InplantDashboardResponse getInplantDashboardDetails();
    ImplantResponse createImplant(ImplantCreateRequest request);

    List<ImplantResponse> getAllImplants();
    ImplantResponse     updateImplant(Long implantId, ImplantCreateRequest request);
    void deleteImplant(Long implantId);
    ImplantResponse getImplantById(Long implantId);
    List<Object[]> getItis();
    List<Object[]> getIndustries(Integer itiCode);
    List<ImplantResponse> getReport(String itiCode);
<<<<<<< HEAD
=======
    ImplantResponse updateImplant(Long implantId, ImplantCreateRequest request);
    void deleteImplant(Long implantId);
>>>>>>> ed78cae23499ee652f4fe43f1a3c84a98148736f
}
