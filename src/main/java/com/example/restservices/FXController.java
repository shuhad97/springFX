package com.example.restservices;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FXController{

    private final Rates exchangeRates = new Rates();

    @GetMapping("/")
    public Rates greeting(){

         
    

            return  exchangeRates;

            // return new Rates(counter.incrementAndGet(), String.format(template, name));

    }

@PostMapping(path = "/exchange", consumes = "application/json", produces = "application/json")
public ExchangeResponse processExchange(@Valid @RequestBody ExchangeRequest exchangeRequest ){

    String exchangeToPair = exchangeRequest.getExchangeTo();
    double exchangeValue = exchangeRequest.getExchangeValue();
    
    ExchangeResponse response = new ExchangeResponse(exchangeValue, exchangeToPair);


    

    return response;


}




}