package com.example.webclientTest.Service.Impl;

import com.example.webclientTest.Service.DataLoadService;
import com.example.webclientTest.VO.PostResultForm;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class DataLoadServiceImpl implements DataLoadService {
    public String postData(){
        File file = new File("./src/main/java/com/example/webclientTest/new 13(1).txt");
        ObjectMapper mapper = new ObjectMapper();
        PostResultForm postResultForm;
        String jsonString;
        try {
             postResultForm = mapper.readValue(file, PostResultForm.class);
             jsonString = mapper.writeValueAsString(postResultForm);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return jsonString;
    }
}
