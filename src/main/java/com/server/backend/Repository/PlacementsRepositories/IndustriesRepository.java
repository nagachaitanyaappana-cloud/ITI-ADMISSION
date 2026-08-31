package com.server.backend.Repository.PlacementsRepositories;
import com.server.backend.entity.Placements.Industries;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface IndustriesRepository extends JpaRepository<Industries, Long> {

    List<Industries> findByItiCode(Integer itiCode);
}