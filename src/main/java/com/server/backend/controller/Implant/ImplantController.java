package com.server.backend.controller.Implant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.backend.DTO.Implant.InplantDashboardResponse;
import com.server.backend.service.Implant.ImplantService;

@RestController
@RequestMapping("/api/implant")
public class ImplantController {

    private final ImplantService implantService;

    public ImplantController(ImplantService implantService) {
        this.implantService = implantService;
    }

    @GetMapping("/overviewdetails")
    public ResponseEntity<InplantDashboardResponse> overviewdetails() {
        return ResponseEntity.ok(implantService.getInplantDashboardDetails());
    }

    @GetMapping("/inplantDashboardDetails")
    public ResponseEntity<InplantDashboardResponse> inplantDashboardDetails() {
        return ResponseEntity.ok(implantService.getInplantDashboardDetails());
    }
}
