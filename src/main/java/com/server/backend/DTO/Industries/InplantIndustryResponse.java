package com.server.backend.DTO.Industries;

import lombok.Data;

@Data
public class InplantIndustryResponse {

    private Long industryId;
    private String industryName;

    public InplantIndustryResponse(Long industryId, String industryName) {
        this.industryId = industryId;
        this.industryName = industryName;
    }
} 