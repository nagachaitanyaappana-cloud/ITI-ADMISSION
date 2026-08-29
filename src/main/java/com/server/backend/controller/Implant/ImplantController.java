package com.server.backend.controller.Implant;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.backend.DTO.Implant.ImplantCreateRequest;
import com.server.backend.DTO.Implant.ImplantResponse;
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

        return ResponseEntity.ok(
                implantService.getInplantDashboardDetails()
        );
    }

    @GetMapping("/inplantDashboardDetails")
    public ResponseEntity<InplantDashboardResponse> inplantDashboardDetails() {

        return ResponseEntity.ok(
                implantService.getInplantDashboardDetails()
        );
    }


   
    @PostMapping
    public ResponseEntity<ImplantResponse> createImplant(
            @RequestBody ImplantCreateRequest request) {

        ImplantResponse response =
                implantService.createImplant(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }


    @GetMapping
    public ResponseEntity<List<ImplantResponse>> getAllImplants() {

        List<ImplantResponse> response =
                implantService.getAllImplants();

        return ResponseEntity.ok(response);
    }


    @GetMapping("/{implantId}")
    public ResponseEntity<ImplantResponse> getImplantById(
            @PathVariable Long implantId) {

        ImplantResponse response =
                implantService.getImplantById(implantId);

        return ResponseEntity.ok(response);
    }

}