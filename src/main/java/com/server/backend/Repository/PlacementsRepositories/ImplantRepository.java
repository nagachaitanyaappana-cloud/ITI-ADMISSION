package com.server.backend.Repository.PlacementsRepositories;
import com.server.backend.entity.Placements.ImplantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
   

public interface ImplantRepository  extends JpaRepository<ImplantEntity, Long> {
}

