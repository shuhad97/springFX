package com.example.restservices;

public class ExchangeResponse {

    private final String base = "GBP";
    private final double input, output;

    public ExchangeResponse(double input, double output){

    this.input = input;
    this.output = output;
    

    }


    public String getBase(){
        
        return base;

    }


    public double input(){

        return input;

    }

    public double getOutput(){

        return output;
    }




}