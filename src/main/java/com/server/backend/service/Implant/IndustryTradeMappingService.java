package com.server.backend.service.Implant;

import com.server.backend.DTO.Implant.IndustryTradeMappingRequest;

public interface IndustryTradeMappingService {

    String saveIndustryTradeMapping(
            IndustryTradeMappingRequest request
    );
}