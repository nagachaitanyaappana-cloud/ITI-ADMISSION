package com.server.backend.entity.Placements;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.math.BigInteger;
import java.sql.Timestamp;
import lombok.Data;
@Entity
@Table(name="industry_partner_details")
@Data
public class IndustryPartnerDetails {
    @Column(name="pid")
    private BigInteger pid;

    @Column(name="dist_code")
    private String distCode;

    @Column(name="entry_by")
    private String entryBy;

    @Column(name="entry_date")
    private Timestamp entryDate;

    @Column(name="iti_code")
    private String itiCode;

    @Column(name="proposed_new_trade")
    private String proposedNewTrade;

    @Column(name="revised_lead_industry_partner")
    private String revisedLeadIndustryPartner;

    @Column(name="revised_lead_sector")
    private String revisedLeadSector;
}
