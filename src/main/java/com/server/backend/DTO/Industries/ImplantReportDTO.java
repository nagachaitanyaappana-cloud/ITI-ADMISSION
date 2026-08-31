package com.server.backend.DTO.Industries;
import java.time.LocalDate;

public class ImplantReportDTO {

    private Long implantId;
    private String facultyName;
    private String tradeShort;
    private String industryAddress;
    private Long hrNo;
    private LocalDate fromDate;
    private LocalDate toDate;
    private Integer noOfStudents;
    private Integer noOfDays;
    private String description;

    public Long getImplantId() {
        return implantId;
    }

    public void setImplantId(Long implantId) {
        this.implantId = implantId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getTradeShort() {
        return tradeShort;
    }

    public void setTradeShort(String tradeShort) {
        this.tradeShort = tradeShort;
    }

    public String getIndustryAddress() {
        return industryAddress;
    }

    public void setIndustryAddress(String industryAddress) {
        this.industryAddress = industryAddress;
    }

    public Long getHrNo() {
        return hrNo;
    }

    public void setHrNo(Long hrNo) {
        this.hrNo = hrNo;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public Integer getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(Integer noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public Integer getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(Integer noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}