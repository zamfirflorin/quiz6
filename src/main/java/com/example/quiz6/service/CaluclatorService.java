package com.example.quiz6.service;

import org.springframework.stereotype.Service;

@Service
public class CaluclatorService {

    public Integer sumIntegers(String first, String second) {
        return Integer.parseInt(first) + Integer.parseInt(second);
    }


}
