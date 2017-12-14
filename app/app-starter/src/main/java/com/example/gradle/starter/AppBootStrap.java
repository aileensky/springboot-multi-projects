package com.example.gradle.starter;


import com.example.gradle.service.AService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppBootStrap {

    @GetMapping("/process")
    public String process(){
        int result = AService.process(100);
        //int result = ParentService.process(100);
        return result+"";
    }


    public static void main(String[] args) {
        SpringApplication.run(AppBootStrap.class);
    }
}