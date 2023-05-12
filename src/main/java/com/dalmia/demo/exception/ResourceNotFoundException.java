package com.dalmia.demo.exception;

import lombok.Getter;
import lombok.Setter;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }


//    public ResourceNotFoundException() {
//    }

//    public String MyMsg(String msg) {
//        return "My MSg";
//    }
}
