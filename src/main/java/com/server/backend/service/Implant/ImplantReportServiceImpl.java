package com.server.backend.service.Implant;

import com.server.backend.DTO.Industries.ImplantIndustryResponse;
import com.server.backend.Repository.PlacementsRepositories.ImplantReportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImplantReportServiceImpl implements ImplantReportService {

    private final ImplantReportRepository repository;

    public ImplantReportServiceImpl(ImplantReportRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ImplantIndustryResponse> getIndustries(Integer itiCode) {

        return repository.getIndustries(itiCode)
                .stream()
                .map(row -> new ImplantIndustryResponse(
                        ((Number) row[0]).longValue(),
                        (String) row[1]
                ))
                .toList();
    }
}