package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.controller.TestController;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {


	@Test
	void test() {
	TestController testController = new TestController();
		String hello = "Hello";
		assertTrue(hello.equals(testController.test()));

	}

}
