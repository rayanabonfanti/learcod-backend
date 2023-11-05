package com.microservice.user;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class ApiGatewayZuulApplicationTests {

	@Test
	void contextLoads() {
    ApiGatewayZuulApplication.main(new String[]{});
    assertTrue(true);
	}

}
