package com.example.webclientTest;

import com.example.webclientTest.Response.ResourceResponse;
import com.example.webclientTest.Response.Response;
import com.example.webclientTest.Service.DataLoadService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class PostTestController {

    @Resource
    DataLoadService dataLoadService;

    @PostMapping("/post")
    public Response postTest(){
        return new ResourceResponse(dataLoadService.postData());
    }
}
