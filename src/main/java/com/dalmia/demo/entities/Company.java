package com.dalmia.demo.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Time;
import java.util.*;

@Entity
//@Data
//@DynamicUpdate
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COMPANY_ID")
    private long companyId;

    //    @NotBlank(message = "Company name must not be null or blank")
    @Column(name = "COMPANY_NAME")
//    @Size(min = 5, max = 20, message = "size must be between 5 and 20")
    @Pattern(regexp = "^[A-Z][a-zA-Z\\-#@\\s.]*$", message = "Regex Not match ")
    private String companyName;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SECTOR_ID")
    private Sector sector;

    @Column(name = "PRESENCE")
    private String presence;

    @Column(name = "FACILITY_COUNT")
    private int facilityCount;

    @NotNull
//    @NotBlank(message = "must not be blank. Must be active or inactive")
    @Column(name = "STATUS")
    private String status;

    @OneToMany(mappedBy = "company")
    private Set<Facility> facilities;
//            = new HashSet<>();

    @OneToMany(mappedBy = "company")
    private Set<Opportunity> opportunities;
//            = new HashSet<>();


    @Column(name = "APPROVED_BY")
    private String approvedBy;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_ON")
    private Calendar createdOn;

    @UpdateTimestamp
    @Temporal(TemporalType.TIME)
    @Column(name = "LAST_MODIFIED")
    private Time lastModified;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }

    public int getFacilityCount() {
        return facilityCount;
    }

    public void setFacilityCount(int facilityCount) {
        this.facilityCount = facilityCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(Set<Facility> facilities) {
        this.facilities = facilities;
    }

    public Set<Opportunity> getOpportunities() {
        return opportunities;
    }

    public void setOpportunities(Set<Opportunity> opportunities) {
        this.opportunities = opportunities;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Calendar getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Calendar createdOn) {
        this.createdOn = createdOn;
    }

    public Time getLastModified() {
        return lastModified;
    }

    public void setLastModified(Time lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }
}
