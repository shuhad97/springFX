package com.example.restservices;




public class ValueZeroOrBelowException extends RuntimeException{


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ValueZeroOrBelowException(double value) {
        
        super("The value should be greater than 0");
        
    }


}

