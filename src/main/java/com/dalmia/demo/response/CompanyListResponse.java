package com.dalmia.demo.response;

import com.dalmia.demo.entities.Company;
import lombok.Data;

import java.util.List;

@Data
public class CompanyListResponse {

    private HeaderResponse header;
    private List<Company> data;


}
