package com.example.hw3_4.school.Controllr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("infoController ")
public class InfoController {

    @Value("${server.port}")
    private Integer serverPort;

    @GetMapping("serverPort")
     public Integer getPort(){
        return serverPort;
     }

}
