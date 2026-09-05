package com.server.backend.service.Implant;

import com.server.backend.DTO.Implant.IndustryPartnerDetailsRequest;
import com.server.backend.DTO.Implant.IndustryPartnerDetailsResponse;
import com.server.backend.entity.Placements.IndustryPartnerDetails;
import com.server.backend.Repository.PlacementsRepositories.IndustryPartnerDetailsRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class IndustryPartnerDetailsServiceImpl
        implements IndustryPartnerDetailsService {

    private final IndustryPartnerDetailsRepository repository;

    public IndustryPartnerDetailsServiceImpl(
            IndustryPartnerDetailsRepository repository) {

        this.repository = repository;
    }

    // CREATE
    @Override
    @Transactional
    public IndustryPartnerDetailsResponse createDetails(
            IndustryPartnerDetailsRequest request) {

        validateRequest(request);

        IndustryPartnerDetails entity =
                new IndustryPartnerDetails();

        entity.setDistCode(request.getDistCode());
        entity.setItiCode(request.getItiCode());
        entity.setRevisedLeadSector(
                request.getRevisedLeadSector()
        );
        entity.setProposedNewTrade(
                request.getProposedNewTrade()
        );
        entity.setRevisedLeadIndustryPartner(
                request.getRevisedLeadIndustryPartner()
        );

        entity.setEntryDate(
                new Timestamp(System.currentTimeMillis())
        );

        IndustryPartnerDetails saved =
                repository.save(entity);

        return convertToResponse(saved);
    }


    // GET ALL
    @Override
    @Transactional(readOnly = true)
    public List<IndustryPartnerDetailsResponse> getAllDetails() {

        return repository.findAll()
                .stream()
                .map(this::convertToResponse)
                .collect(Collectors.toList());
    }


    // GET ONE
    @Override
    @Transactional(readOnly = true)
    public IndustryPartnerDetailsResponse getDetailsById(
            Long pid) {

        IndustryPartnerDetails entity =
                repository.findById(pid)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Industry partner details not found: "
                                                + pid
                                )
                        );

        return convertToResponse(entity);
    }


    // UPDATE
    @Override
    @Transactional
    public IndustryPartnerDetailsResponse updateDetails(
            Long pid,
            IndustryPartnerDetailsRequest request) {

        validateRequest(request);

        IndustryPartnerDetails entity =
                repository.findById(pid)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Industry partner details not found: "
                                                + pid
                                )
                        );

        entity.setDistCode(request.getDistCode());
        entity.setItiCode(request.getItiCode());
        entity.setRevisedLeadSector(
                request.getRevisedLeadSector()
        );
        entity.setProposedNewTrade(
                request.getProposedNewTrade()
        );
        entity.setRevisedLeadIndustryPartner(
                request.getRevisedLeadIndustryPartner()
        );

        IndustryPartnerDetails updated =
                repository.save(entity);

        return convertToResponse(updated);
    }


    // DELETE
    @Override
    @Transactional
    public void deleteDetails(Long pid) {

        IndustryPartnerDetails entity =
                repository.findById(pid)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Industry partner details not found: "
                                                + pid
                                )
                        );

        repository.delete(entity);
    }


    // Convert Entity → Response
    private IndustryPartnerDetailsResponse convertToResponse(
            IndustryPartnerDetails entity) {

        return new IndustryPartnerDetailsResponse(
                entity.getPid(),
                entity.getDistCode(),
                entity.getItiCode(),
                entity.getRevisedLeadSector(),
                entity.getProposedNewTrade(),
                entity.getRevisedLeadIndustryPartner(),
                entity.getEntryBy(),
                entity.getEntryDate()
        );
    }


    // Validation
    private void validateRequest(
            IndustryPartnerDetailsRequest request) {

        if (request.getDistCode() == null ||
                request.getDistCode().isBlank()) {

            throw new RuntimeException(
                    "District code is required"
            );
        }

        if (request.getItiCode() == null ||
                request.getItiCode().isBlank()) {

            throw new RuntimeException(
                    "ITI code is required"
            );
        }
    }
}