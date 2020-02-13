package com.example.restservices;

import java.util.Map;
import com.example.restservices.PairNotFoundException;

public class ExchangeResponse {

    private final String basePair = "GBP";
    private final String quotePair;
    private final double input, output;

    public ExchangeResponse(double input, String quotePair){

    this.input = input;
    this.quotePair = quotePair;
    output = outputCalculate(quotePair);
    

    }

    public double outputCalculate(String quotePair){
       double quote;
       Map<String, Double> rates = new Rates().getRates();
       
       double fee = calculateFee(input);

        
       try{
        quote = (input-fee) * rates.get(quotePair);
       } catch (Exception e){
           throw new PairNotFoundException(quotePair);
       }

       return quote;
       
    }

    public double calculateFee(double amountSent){

        if(amountSent < 1000){

            return 25;

        } else {

            return amountSent * 0.01;

        }
        
    }





    public String getBase(){
        
        return basePair;

    }


    public double input(){

        return input;

    }

    public double getOutput(){
    
        return output;

    }




}