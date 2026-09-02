package com.server.backend.service;


import java.util.List;

import com.server.backend.DTO.LabsReportDTO;

public interface LabsReportService {

    List<LabsReportDTO> getLabsReport(
            String itiCode,
            String industryName);

}
