package com.example.restservices;

import java.util.Map;


//Class for serialsing the JSON response to be sent back

public class ExchangeResponse {

    private final String basePair = "GBP";
    private final String quotePair;
    private final double input, output;



    public ExchangeResponse(double input, String quotePair){

    if(input <=0){
        throw new ValueZeroOrBelowException(input);
    }


    this.input = input;
   
    this.quotePair = quotePair;
    output = outputCalculate(quotePair);
    

    }

    //Calculates output, decided by the pair given
    public double outputCalculate(String quotePair){
       Double quote;
       Map<String, Double> rates = new Rates().getRates();
       
       double fee = calculateFee(input);

        
       try{
        quote = (input-fee) * rates.get(quotePair);
       } catch(Exception e){
        throw new PairNotFoundException(quotePair);
       }
       return quote;
       
    }

    //Method for calculating the fee
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