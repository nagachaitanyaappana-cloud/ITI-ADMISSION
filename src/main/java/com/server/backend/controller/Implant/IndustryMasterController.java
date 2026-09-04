package com.server.backend.controller.Implant;

import com.server.backend.DTO.Implant.IndustryMasterRequest;
import com.server.backend.DTO.Implant.IndustryMasterResponse;
import com.server.backend.service.Implant.IndustryMasterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/implant/industries")
public class IndustryMasterController {

    private final IndustryMasterService industryMasterService;

    public IndustryMasterController(
            IndustryMasterService industryMasterService) {

        this.industryMasterService = industryMasterService;
    }

    @PostMapping
    public ResponseEntity<IndustryMasterResponse> createIndustry(
            @RequestBody IndustryMasterRequest request) {

        IndustryMasterResponse response =
                industryMasterService.createIndustry(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }
}