package com.example.restservices;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import org.springframework.boot.test.context.SpringBootTest;

//Test cases for input of the calculation

@SpringBootTest
class FeeCalculationTest {
	//Based on £1 = 1.29EUR
	
	@Test
	void below_1000Test() {
        ExchangeResponse calculate = new ExchangeResponse(900, "EUR");
		
        assertEquals(1032.5, calculate.getOutput());
	}


	@Test 
	void above_1000Test(){
        ExchangeResponse calculate = new ExchangeResponse(1000, "EUR");

		assertEquals(1168.2, calculate.getOutput());
	}

	@Test
	void below_0Test(){

		assertThrows(ValueZeroOrBelowException.class,
		()->{
			ExchangeResponse calculate = new ExchangeResponse(-1, "EUR");

		});
	}




}
