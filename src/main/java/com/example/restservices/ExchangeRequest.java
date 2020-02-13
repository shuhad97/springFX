package com.example.restservices;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


public class ExchangeRequest{

    @NotNull(message = "Please provide a pair")
    @NotEmpty(message = "Please provide an input")
    private final String exchangeTo;
    @NotNull(message = "Please provide Value for exchange")
    private final double exchangeValue;
    
    
    public ExchangeRequest(String exchangeTo, double exchangeValue){

        this.exchangeTo = exchangeTo;
        this.exchangeValue = exchangeValue;


    }

    public String getExchangeTo(){

        return exchangeTo;


    }

    public Double getExchangeValue (){

        return exchangeValue;
    }








}