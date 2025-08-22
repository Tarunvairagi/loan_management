package com.loan_management;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LendPrefectApplicationTests {

	@Test
	void contextLoads() {
		int a = 10;
		int b = 20;
		boolean isPresent = false;
		if(!isPresent){
			System.out.print("Hello world : " + a+b);
		}
	}

}
