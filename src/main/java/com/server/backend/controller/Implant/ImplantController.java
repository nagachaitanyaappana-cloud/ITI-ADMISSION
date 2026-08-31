package com.server.backend.controller.Implant;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.server.backend.DTO.Implant.ImplantCreateRequest;
import com.server.backend.DTO.Implant.ImplantResponse;
import com.server.backend.DTO.Implant.InplantDashboardResponse;
import com.server.backend.service.Implant.ImplantService;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Implant", description = "Implant management APIs")
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

   // Get a specific implant record by its ID
    @GetMapping("/{implantId}")
    public ResponseEntity<ImplantResponse> getImplantById(
            @PathVariable Long implantId) {

        ImplantResponse response =
                implantService.getImplantById(implantId);

        return ResponseEntity.ok(response);
    }
    // Update an existing implant record by its ID
    @PutMapping("/{implantId}")
public ResponseEntity<ImplantResponse> updateImplant(
        @PathVariable Long implantId,
        @RequestBody ImplantCreateRequest request) {

    ImplantResponse response =
            implantService.updateImplant(implantId, request);

    return ResponseEntity.ok(response);
}    
    // Delete an implant record by its ID
    @DeleteMapping("/{implantId}")
    public ResponseEntity<Void> deleteImplant(
        @PathVariable Long implantId) {

    implantService.deleteImplant(implantId);

    return ResponseEntity.noContent().build();
}
    //district login chesina user ki iti code dorikithe, iti code tho industries dorikithe, industries tho trades dorikithe, trades tho report dorikithe, report ni return cheyali
    @GetMapping("/itis")
public ResponseEntity<List<Object[]>> getItis() {
    return ResponseEntity.ok(
            implantService.getItis());
}
 
@GetMapping("/industries")
public ResponseEntity<List<Object[]>> getIndustries(
        @RequestParam Integer itiCode) {

    return ResponseEntity.ok(
            implantService.getIndustries(itiCode));
}
//report endpoint to fetch the report based on itiCode
    @GetMapping("/report")
public ResponseEntity<List<ImplantResponse>> getReport(
        @RequestParam String itiCode) {

    return ResponseEntity.ok(
            implantService.getReport(itiCode)
    );
}
}