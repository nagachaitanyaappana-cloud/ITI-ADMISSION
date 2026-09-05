package com.server.backend.controller.Implant;

import com.server.backend.DTO.Implant.IndustryPartnerDetailsRequest;
import com.server.backend.DTO.Implant.IndustryPartnerDetailsResponse;
import com.server.backend.service.Implant.IndustryPartnerDetailsService;

import io.swagger.v3.oas.annotations.tags.Tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/implant/industry-partner-details")
@Tag(
        name = "Industry Partner Details",
        description = "APIs for Industry Partner Details"
)
public class IndustryPartnerDetailsController {

    private final IndustryPartnerDetailsService service;

    public IndustryPartnerDetailsController(
            IndustryPartnerDetailsService service) {

        this.service = service;
    }


    // CREATE
    @PostMapping
    public ResponseEntity<IndustryPartnerDetailsResponse>
    createDetails(
            @RequestBody IndustryPartnerDetailsRequest request) {

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(service.createDetails(request));
    }


    // GET ALL
    @GetMapping
    public ResponseEntity<List<IndustryPartnerDetailsResponse>>
    getAllDetails() {

        return ResponseEntity.ok(
                service.getAllDetails()
        );
    }


    // GET ONE
    @GetMapping("/{pid}")
    public ResponseEntity<IndustryPartnerDetailsResponse>
    getDetailsById(
            @PathVariable Long pid) {

        return ResponseEntity.ok(
                service.getDetailsById(pid)
        );
    }


    // UPDATE
    @PutMapping("/{pid}")
    public ResponseEntity<IndustryPartnerDetailsResponse>
    updateDetails(
            @PathVariable Long pid,
            @RequestBody IndustryPartnerDetailsRequest request) {

        return ResponseEntity.ok(
                service.updateDetails(pid, request)
        );
    }


    // DELETE
    @DeleteMapping("/{pid}")
    public ResponseEntity<Void> deleteDetails(
            @PathVariable Long pid) {

        service.deleteDetails(pid);

        return ResponseEntity.noContent().build();
    }
}