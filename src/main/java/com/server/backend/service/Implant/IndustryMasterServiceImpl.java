package com.server.backend.service.Implant;

import com.server.backend.DTO.Implant.IndustryMasterRequest;
import com.server.backend.DTO.Implant.IndustryMasterResponse;
import com.server.backend.entity.Placements.IndustryMaster;
import com.server.backend.Repository.PlacementsRepositories.IndustryMasterRepository;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.sql.Timestamp;
@Service
public class IndustryMasterServiceImpl implements IndustryMasterService {

    private final IndustryMasterRepository repository;

    public IndustryMasterServiceImpl(
            IndustryMasterRepository repository) {
        this.repository = repository;
    }

    @Override
    public IndustryMasterResponse createIndustry(
            IndustryMasterRequest request) {

        IndustryMaster entity = new IndustryMaster();

        entity.setIndustryName(request.getIndustryName());
        entity.setIndustryType(request.getIndustryType());
        entity.setIndustryAddress(request.getIndustryAddress());

        entity.setEntryTime(new Timestamp(System.currentTimeMillis()));
        IndustryMaster savedEntity =
                repository.save(entity);

        return new IndustryMasterResponse(
                savedEntity.getIndustryId(),
                savedEntity.getIndustryName(),
                savedEntity.getIndustryType(),
                savedEntity.getIndustryAddress()
        );
    }
}