package com.server.backend.Repository.PlacementsRepositories;
import com.server.backend.entity.Placements.IndustryMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface IndustryMasterRepository extends JpaRepository<IndustryMaster, Long> {
    // findByIndustryCode removed: IndustryMaster has no industryCode field and no
    // caller existed (broke Spring Data query creation at startup).

}

