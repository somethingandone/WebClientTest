package com.example.webclientTest.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ErrorResponse extends EmptyResponse {
    @JsonProperty("msg")
    private String msg;

    public ErrorResponse(String message, String error){
        super(error);
        this.msg=message;
    }
}
