package com.server.backend.Repository.placementsRepositories;
import com.server.backend.entity.Placements.ImplantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ImplantRepository  extends JpaRepository<ImplantEntity, Long> {
    List <ImplantEntity> findByItiCode(String itiCode);
}

