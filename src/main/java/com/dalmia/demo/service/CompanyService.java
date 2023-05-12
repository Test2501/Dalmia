package com.dalmia.demo.service;

import com.dalmia.demo.entities.Company;

import java.util.List;

public interface CompanyService {

    Company createCompany(Company company);

    Company getCompanyById(int id);

    Company findByName(String name);

    List<Company> getAllCompanies();

    Company updateCompany(Company company, int id);

    void delete(int id);


}
