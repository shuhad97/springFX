package com.example.restservices;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class pairCheck {


    @Test
    void pairDoesNotExist(){

        assertThrows(PairNotFoundException.class,
        ()->{

            ExchangeResponse calculate = new ExchangeResponse(1000, "XYZ");


        });


    }




}