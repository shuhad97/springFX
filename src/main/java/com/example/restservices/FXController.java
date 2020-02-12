package com.example.restservices;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FXController{

    private static final String template = "Hello, %s ";

    private final Rates exchangeRates = new Rates();

    @GetMapping("/")
    public Rates greeting(){

         
    

            return  exchangeRates;

            // return new Rates(counter.incrementAndGet(), String.format(template, name));

    }

@PostMapping(path = "/exchange", consumes = "application/json", produces = "application/json")
public ExchangeResponse processExchange(@RequestBody ExchangeRequest exchangeRequest ){
    System.out.println(exchangeRequest.getExchangeTo() + "+++++");
    System.out.println(exchangeRequest.getExchangeValue() + "+++++");

    String exchangeToPair = exchangeRequest.getExchangeTo();
    double exchangeValue = exchangeRequest.getExchangeValue();
    
    ExchangeResponse response = new ExchangeResponse(exchangeValue, exchangeToPair);


    

    return response;


}




}