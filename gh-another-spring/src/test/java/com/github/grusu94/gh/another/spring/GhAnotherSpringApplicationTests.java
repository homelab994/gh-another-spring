package com.github.grusu94.gh.another.spring;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {
        "spring.cloud.config.enabled=false",
        "spring.profiles.active=test"
})
class GhAnotherSpringApplicationTests {

	@Test
	void contextLoads() {
	}

}
