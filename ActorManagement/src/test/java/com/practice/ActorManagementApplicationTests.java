package com.practice;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ActorManagementApplicationTests {

	
	
	Calculator cal;
	
	
	@Test
	void contextLoads() {
	}
	
	@BeforeEach
	public void setUp() {
		cal = new Calculator();
		
	}
	
	@Test
	public void testSum() {
		int expectedResult=10;
		int actualResult=cal.doSum(4,3, 3);
		
		assertThat(actualResult).isEqualTo(expectedResult);
		
		
	}
	
	@Test
	public void testProduct() {
		int expected=10;
		int actualResult=cal.doProduct(5,2);
		
		assertThat(actualResult).isEqualTo(expected);
		
	}

	@Test
	public void testCompareTo() {
        Boolean val= cal.compareTwoNums(5, 5);
         assertThat(val).isTrue();
         
	}
	
	@Test
	public void testDivide() {
		int expected=2;
		int actual=cal.divide(10,5);
		
		assertThat(actual).isEqualTo(expected);
		
	}
	}

