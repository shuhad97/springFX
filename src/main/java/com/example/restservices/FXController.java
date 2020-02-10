package com.example.restservices;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FXController{

    private static final String template = "Hello, %s ";
    private final AtomicLong counter = new AtomicLong();
    private final Rates exchangeRates = new Rates();

    @GetMapping("/")
    public Rates greeting(){

         
    

            return  exchangeRates;

            // return new Rates(counter.incrementAndGet(), String.format(template, name));

    }

    @PostMapping("/exchange")
    public Exchange 







}