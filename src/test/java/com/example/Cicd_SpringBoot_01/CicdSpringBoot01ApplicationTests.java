package com.example.Cicd_SpringBoot_01;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CicdSpringBoot01ApplicationTests {

	@Test
	void contextLoads() {
		throw  new RuntimeException("Test failed intentionally");
	}

}
