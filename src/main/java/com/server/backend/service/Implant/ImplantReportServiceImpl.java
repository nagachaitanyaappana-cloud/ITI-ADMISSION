package com.server.backend.service.Implant;
import com.server.backend.DTO.Industries.ImplantIndustryResponse;
import com.server.backend.DTO.Industries.ImplantReportDTO;
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

    @Override
    public List<ImplantReportDTO> getImplantReportByIndustry(Integer industryId) {

        return repository.getImplantReportByIndustry(industryId)
                .stream()
                .map(row -> new ImplantReportDTO(
                        ((Number) row[0]).longValue(),   // implantId
                        ((Number) row[1]).longValue(),   // industryId
                        (String) row[2],                // industryName
                        (String) row[3],                // facultyName
                        (String) row[4],                // tradeShort
                        (String) row[5],                // industryAddress
                        ((Number) row[6]).longValue(),  // hrNo
                        rsDate(row[7]),                // fromDate
                        rsDate(row[8]),                // toDate
                        ((Number) row[9]).intValue(),   // noOfDays
                        ((Number) row[10]).intValue(),  // noOfStudents
                        (String) row[11],               // location
                        (String) row[12]                // description
                ))
                .toList();
    }

    private java.util.Date rsDate(Object value) {
        return value == null ? null : (java.util.Date) value;
    }
}