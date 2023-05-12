package com.dalmia.demo.response;

import com.dalmia.demo.entities.Company;
import lombok.Data;

@Data
public class CompanyResponse {

    private HeaderResponse header;
    private Company data;


}
