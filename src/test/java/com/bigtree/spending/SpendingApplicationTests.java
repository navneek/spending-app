package com.bigtree.spending;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.bigtree.spending.controller.SpendingController;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpendingApplicationTests {

	@Autowired
	SpendingController spendingController;

	@Test
	void contextLoads() {
		assertNotNull(spendingController);
	}

}
