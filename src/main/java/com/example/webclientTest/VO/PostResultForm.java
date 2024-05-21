package com.example.webclientTest.VO;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PostResultForm implements Serializable {

    @JsonProperty("rtnMsg")
    private String rtnMsg;

    @JsonProperty("retJson")
    private String retJson;

    @JsonProperty("rtnCode")
    private String rtnCode;

}
