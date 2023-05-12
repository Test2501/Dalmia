package com.dalmia.demo.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HeaderResponse {

    private int responseCode;
    private String responseMessage;

}
