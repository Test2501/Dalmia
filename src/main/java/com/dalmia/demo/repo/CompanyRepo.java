package com.dalmia.demo.repo;

import com.dalmia.demo.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepo extends JpaRepository<Company, Integer> {

    Optional<Company> findByCompanyName(String name);

}
