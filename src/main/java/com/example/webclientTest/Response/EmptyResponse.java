package com.example.webclientTest.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class EmptyResponse implements Response {

    @JsonProperty("code")
    private String error;

    public EmptyResponse(){
        this.error="200";
    }

    public EmptyResponse(String error){
        this.error=error;
    }
}
