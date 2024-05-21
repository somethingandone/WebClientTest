package com.example.webclientTest.Response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ResourceResponse extends EmptyResponse {
    @JsonProperty("data")
    private Object data;

    public ResourceResponse(Object data){
        this.data=data;
    }
}
