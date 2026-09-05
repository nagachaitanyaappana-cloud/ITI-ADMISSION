package com.server.backend.service.Implant;

import com.server.backend.DTO.Implant.IndustryMasterRequest;
import com.server.backend.DTO.Implant.IndustryMasterResponse;

public interface IndustryMasterService {

    IndustryMasterResponse createIndustry(IndustryMasterRequest request);
}
