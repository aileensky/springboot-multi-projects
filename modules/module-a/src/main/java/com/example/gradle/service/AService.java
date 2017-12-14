package com.example.gradle.service;

import com.example.gradle.ParentService;

public class AService {

    public static int process(int param){
        return ParentService.process((param+10));
    }
}
