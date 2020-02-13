package com.example.restservices;




public class PairNotFoundException extends RuntimeException{


    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public PairNotFoundException(String pair) {
        
        super("The " + pair+ " was not found");
    }


}

