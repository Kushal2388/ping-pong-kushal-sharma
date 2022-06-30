package com.RoxorGaming.pingpong;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PingPongApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	void contextLoads(){

	}

	@Test
	public void controllerMethodShouldReturnDefaultMessage(){
		assertThat(this.testRestTemplate.getForObject("http://localhost:"+port+"/ping",String.class))
				.contains("pong");
	}



}
