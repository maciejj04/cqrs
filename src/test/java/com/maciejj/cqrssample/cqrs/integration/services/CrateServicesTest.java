package com.maciejj.cqrssample.cqrs.integration.services;

import com.maciejj.cqrssample.cqrs.integration.BaseIntegrationTest;
import com.maciejj.cqrssample.cqrs.commands.CreateNewTemplateCommand;
import com.maciejj.cqrssample.cqrs.domain.ApplicationTemplatesRepository;
import io.restassured.RestAssured;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;
import static org.assertj.core.api.Assertions.assertThat;

public class CrateServicesTest extends BaseIntegrationTest {

    @Autowired
    ApplicationTemplatesRepository repository;

    @Test
    public void shouldStoreTemplateInDb(){
        // given
        String appName = randomAlphanumeric(6);

        // when
        RestAssured
                .expect()
                    .statusCode(200)
                .given()
                    .body(new CreateNewTemplateCommand(appName))
                    .contentType("application/json")
                .when()
                    .post("http://localhost:" + port + "/create-template");

        // then
        assertThat(repository.findAll().iterator().next().getName()).isEqualTo(appName);
    }
}
