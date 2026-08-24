package com.server.backend.controller.Placements;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.server.backend.DTO.Placements.PlacementsDistinctItiResponse;
import com.server.backend.DTO.Placements.PlacementsGroupedResponse;
import com.server.backend.DTO.Placements.PlacementsOverviewResponse;
import com.server.backend.service.Placements.PlacementsService;

@RestController
@RequestMapping("/api/placements")
public class PlacementsController {

    private final PlacementsService placementsService;

    public PlacementsController(PlacementsService placementsService) {
        this.placementsService = placementsService;
    }

    @GetMapping("/overviewdetails")
    public ResponseEntity<PlacementsOverviewResponse> overviewdetails() {
        return ResponseEntity.ok(placementsService.getOverviewDetails());
    }

    @GetMapping("/countPlacementsGroupedByPtype")
    public ResponseEntity<PlacementsGroupedResponse> countPlacementsGroupedByPtype() {
        return ResponseEntity.ok(placementsService.getCountPlacementsGroupedByPtype());
    }

    @GetMapping("/getdDistinctItiCodesByPtype")
    public ResponseEntity<PlacementsDistinctItiResponse> getdDistinctItiCodesByPtype() {
        return ResponseEntity.ok(placementsService.getDistinctItiCodesByPtype());
    }
}
