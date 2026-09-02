package com.server.backend.service.Implant;
import com.server.backend.DTO.Industries.ImplantIndustryResponse;

import java.util.List;

public interface ImplantReportService {

    List<ImplantIndustryResponse> getIndustries(Integer itiCode);

}