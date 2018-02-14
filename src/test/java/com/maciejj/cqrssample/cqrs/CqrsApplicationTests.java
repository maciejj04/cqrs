package com.maciejj.cqrssample.cqrs;

import com.maciejj.cqrssample.cqrs.infrastructure.CommandBus;
import com.maciejj.cqrssample.cqrs.integration.BaseIntegrationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

//@WebAppConfiguration
public class CqrsApplicationTests extends BaseIntegrationTest {

	@Autowired
	CommandBus commandBus;

	@Autowired
	TestRestTemplate testRestTemplate1;


	@Test
	public void contextLoads() {}

	@Test
	public void statusIsProper(){
		TestRestTemplate testRestTemplate2 = new TestRestTemplate();
	//	String responseObj = testRestTemplate.getForObject("http://127.0.0.1:8080/app-status", String.class);
		ResponseEntity<String> responseEntity = testRestTemplate1.getForEntity("/app-status", String.class);
		//"http://localhost:" + port +
		//assertThat(responseObj).containsIgnoringCase("Hey");
		assertThat(responseEntity.getStatusCode()).isEqualByComparingTo(HttpStatus.OK);

	}

}
