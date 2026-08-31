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
<<<<<<< HEAD
    List<Object[]> getItis();
    List<Object[]> getIndustries(Integer itiCode);
    List<ImplantResponse> getReport(String itiCode);
=======
    ImplantResponse updateImplant(Long implantId, ImplantCreateRequest request);
    void deleteImplant(Long implantId);
>>>>>>> 041781efa9b809cf15507b8c64a7bdc32ee6bee9
}
