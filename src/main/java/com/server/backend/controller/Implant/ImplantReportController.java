package com.server.backend.controller.Implant;

import com.server.backend.DTO.Industries.ImplantIndustryResponse;
import com.server.backend.service.Implant.ImplantReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inplant-report")
public class ImplantReportController {

    private final ImplantReportService service;

    public ImplantReportController(ImplantReportService service) {
        this.service = service;
    }

    @GetMapping("/industries")
    public ResponseEntity<List<ImplantIndustryResponse>> getIndustries(
            @RequestParam Integer itiCode) {

        return ResponseEntity.ok(
                service.getIndustries(itiCode)
        );
    }
}