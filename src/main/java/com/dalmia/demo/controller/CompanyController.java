package com.dalmia.demo.controller;

import com.dalmia.demo.entities.Company;
import com.dalmia.demo.response.CompanyListResponse;
import com.dalmia.demo.response.CompanyResponse;
import com.dalmia.demo.response.HeaderResponse;
import com.dalmia.demo.service.CompanyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
//@Validated
public class CompanyController {

    @Autowired
    CompanyService service;


    @PostMapping("")
    public ResponseEntity<Company> createCompany(@Valid @RequestBody Company company) {
        Company savedCompany = service.createCompany(company);

        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<CompanyListResponse> getAllCompanies() {

        CompanyListResponse response = new CompanyListResponse();
        HeaderResponse header = new HeaderResponse(101, "Response Successfull");
        response.setHeader(header);

        List<Company> allCompanies = service.getAllCompanies();
        response.setData(allCompanies);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyResponse> getCompanyById(@PathVariable int id) {

        CompanyResponse response = new CompanyResponse();
        HeaderResponse header = new HeaderResponse(101, "Response Successfull");
        response.setHeader(header);

        Company company = service.getCompanyById(id);
        response.setData(company);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }


    @PutMapping("/{id}")
    public ResponseEntity<Company> updateCompany(@Valid @RequestBody Company company, @PathVariable int id) {
        Company updatedCompany = service.updateCompany(company, id);

        return new ResponseEntity<>(updatedCompany, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompany(@PathVariable int id) {
        service.delete(id);
        return new ResponseEntity<>("Company deleted with id: " + id, HttpStatus.OK);
    }


    @GetMapping("/name/{name}")
    public ResponseEntity<Company> getCompanyByName(@PathVariable String name) {
        Company company = service.findByName(name);

        return new ResponseEntity<>(company, HttpStatus.OK);
    }


}
