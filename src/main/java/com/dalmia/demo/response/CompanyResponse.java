package com.dalmia.demo.response;

import com.dalmia.demo.entities.Company;
import lombok.Data;

@Data
public class CompanyResponse<T> {

    private HeaderResponse header;
    private T data;


}
