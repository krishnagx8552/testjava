package com.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsExampleApplicationTests {
	Logger  logger = LoggerFactory.getLogger(JenkinsExampleApplicationTests.class);

	@Test
	void contextLoads() {
		
		logger.info("Hello world , this is vamsi....!");
		assertTrue(true);
	}

}
