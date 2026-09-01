package com.server.backend.service.Placements;

import com.server.backend.DTO.Placements.PlacementsDistinctItiResponse;
import com.server.backend.DTO.Placements.PlacementsGroupedResponse;
import com.server.backend.DTO.Placements.PlacementsOverviewResponse;

public interface PlacementsService {
    PlacementsOverviewResponse getOverviewDetails();
    PlacementsGroupedResponse getCountPlacementsGroupedByPtype();
    PlacementsDistinctItiResponse getDistinctItiCodesByPtype();
}
