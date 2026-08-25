package com.server.backend.entity.Placements;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Column;
import java.math.BigInteger;
import java.sql.Timestamp;
@Entity
@Table(name="industry_master" ,schema="placements")
@Data
public class IndustryMaster {
    @Id
    @Column(name="industry_id")
    private BigInteger industryId;

    @Column(name="industry_address")
    private String industryAddress;

    @Column(name="industry_name")
    private String industryName;

    @Column(name="industry_type")
    private String industryType;

    @Column(name="entry_by")
    private String entryBy;

    @Column(name="entry_time")
    private Timestamp entryTime;

    @Column(name="edit_by")
    private String editBy;
    
    @Column(name="edit_time")
    private Timestamp editTime;
}
