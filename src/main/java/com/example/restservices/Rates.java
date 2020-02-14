package com.example.restservices;

import java.util.HashMap;
import java.util.Map;


//Class that keeps store of the rates

public class Rates {

    private final Map<String,Double> rates = new HashMap<String, Double>() ;

    

    public Rates (){

       rates.put("USD", 1.29);
       rates.put("EUR", 1.18);
       rates.put("JPY", 141.69 );

        
    }



    public Map<String, Double> getRates(){
        return rates;
    }
    









}