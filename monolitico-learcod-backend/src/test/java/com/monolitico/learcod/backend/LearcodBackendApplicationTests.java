package com.monolitico.learcod.backend;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LearcodBackendApplicationTests {

	@Test
	void contextLoads() {
    LearcodBackendApplication.main(new String[]{});
    assertTrue(true);
	}

}
