package com.server.backend.service.Implant;

import com.server.backend.DTO.Implant.IndustryTradeMappingRequest;
import com.server.backend.DTO.Implant.IndustryTradeMappingResponse;

public interface IndustryTradeMappingService {

    String saveIndustryTradeMapping(
            IndustryTradeMappingRequest request
    );
     String updateIndustryTradeMapping(
            Long slno,
            IndustryTradeMappingRequest request
    );
    IndustryTradeMappingResponse getIndustryTradeMapping(Long slno);
    void deleteIndustryTradeMapping(Long slno);
}