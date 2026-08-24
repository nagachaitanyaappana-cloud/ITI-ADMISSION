package com.server.backend.controller.Labs;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.backend.DTO.Labs.LabsDashboardResponse;
import com.server.backend.service.Labs.LabsService;

@RestController
@RequestMapping("/api/labs")
public class LabsController {

    private final LabsService labsService;

    public LabsController(LabsService labsService) {
        this.labsService = labsService;
    }

    @GetMapping("/overviewdetails")
    public ResponseEntity<LabsDashboardResponse> overviewdetails() {
        return ResponseEntity.ok(labsService.getLabsDashboardDetails());
    }

    @GetMapping("/labsDashboardDetails")
    public ResponseEntity<LabsDashboardResponse> labsDashboardDetails() {
        return ResponseEntity.ok(labsService.getLabsDashboardDetails());
    }
}
