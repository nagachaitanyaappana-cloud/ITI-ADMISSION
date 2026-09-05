package com.server.backend.Repository.PlacementsRepositories;

import com.server.backend.entity.Placements.IndustryPartnerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndustryPartnerDetailsRepository
        extends JpaRepository<IndustryPartnerDetails, Long> {

}