package com.example.restservices;



public class ExchangeRequest{

    private final String exchangeTo;
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