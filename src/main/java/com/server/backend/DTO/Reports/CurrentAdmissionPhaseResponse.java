package com.server.backend.DTO.Reports;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrentAdmissionPhaseResponse {
    private String year;
    private int phase;
}
