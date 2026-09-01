package com.server.backend.controller.Implant;

import com.server.backend.DTO.Implant.IndustryTradeMappingRequest;
import com.server.backend.service.Implant.IndustryTradeMappingService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/placements/industry-trade-mapping")
@Tag(
    name = "Industry Trade Mapping Controller",
    description = "APIs for mapping industries with trades for an ITI"
)
public class IndustryTradeMappingController {

    private final IndustryTradeMappingService mappingService;

    public IndustryTradeMappingController(
            IndustryTradeMappingService mappingService) {

        this.mappingService = mappingService;
    }

    @PostMapping
    public ResponseEntity<String> saveMapping(
            @RequestBody IndustryTradeMappingRequest request) {

        return ResponseEntity.ok(
                mappingService.saveIndustryTradeMapping(request)
        );
    }
}