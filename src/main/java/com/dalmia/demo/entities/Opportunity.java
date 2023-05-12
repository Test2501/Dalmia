package com.dalmia.demo.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.*;

@Data
@Entity
public class Opportunity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int opId;

    @NonNull
    private String source;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @NonNull
    private String scope;


    @OneToMany(mappedBy = "opportunity")
    private Set<Facility> facilities = new HashSet<>();

    @OneToMany(mappedBy = "opportunity")
    private Set<ContactPerson> contactPeople = new HashSet<>();

    @Column(name = "APPROVED_BY")
    private String approvedBy;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATED_ON")
    private Calendar createdOn;

    @UpdateTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFIED")
    private Calendar lastModified;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "MODIFIED_BY")
    private String modifiedBy;


}
