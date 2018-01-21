package com.maciejj.cqrssample.cqrs.integration;

import com.maciejj.cqrssample.cqrs.CqrsApplication;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ContextConfiguration(classes = CqrsApplication.class)
//@TestPropertySource(properties = {""})
@Ignore
public class BaseIntegrationTest {
    @LocalServerPort
    protected int port;
}
