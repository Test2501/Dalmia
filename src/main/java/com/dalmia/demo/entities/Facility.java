package com.dalmia.demo.entities;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.*;

@Entity
@Data
public class Facility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FACILITY_ID")
    private int facilityId;

    @Column(name = "FACILITY_NAME")
    private String facilityName;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private Company company;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "PIN_CODE")
    private int pincode;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "STATE")
    private String state;

    @Column(name = "GEO_LATITUDE")
    private String geoLatitude;

    @Column(name = "GEO_LONGITUDE")
    private String geoLongitude;

    @ManyToOne
    private TargetPlant targetPlant;

    @ManyToMany
    @JoinTable(name = "FACILITY_WASTE_TYPE", joinColumns =
    @JoinColumn(name = "FACILITY_ID"), inverseJoinColumns = @JoinColumn(name = "WASTE_ID"))
    private Set<WasteType> waste = new HashSet<>();

    @OneToMany(mappedBy = "facility")
    private Set<ContactPerson> contactPeople = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "OPPORTUNITY_ID")
    private Opportunity opportunity;


    @Column(name = "APPROVED_BY")
    private String approvedBy;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_ON")
    private Calendar createdOn;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED")
    private Calendar lastModified;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;

}
