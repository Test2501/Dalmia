package com.dalmia.demo.service;

import com.dalmia.demo.entities.Company;
import com.dalmia.demo.exception.ResourceNotFoundException;
import com.dalmia.demo.repo.CompanyRepo;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepo companyRepo;

//    @Transactional
    @Override
    public Company createCompany(Company company) {


        Company savedCompany = companyRepo.save(company);

        return savedCompany;
    }

    @Override
    public Company getCompanyById(int id) {
        Company company = companyRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Company not found with id: " + id));

        return company;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepo.findAll();
    }

//    @Transactional
    @Override
    public Company updateCompany(Company company, int id) {
        Company existingCompany = companyRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Company not found with id: " + id));
//        existingCompany.set company;

        company.setCompanyId(id);
        Company updatedCompany = companyRepo.save(company);
        return updatedCompany;
    }

//    @Transactional
    @Override
    public void delete(int id) {
        Company existingCompany = companyRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Company not found with id: " + id));

        companyRepo.deleteById(id);
    }

    @Override
    public Company findByName(String name) {
        Company existingCompany = companyRepo.findByCompanyName(name).orElseThrow(() -> new ResourceNotFoundException("Company not found with id: " + name));

        return existingCompany;
    }
}
