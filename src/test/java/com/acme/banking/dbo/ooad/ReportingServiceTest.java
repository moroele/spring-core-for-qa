package com.acme.banking.dbo.ooad;

import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration({"classpath:new-test-spring-context.xml", "classpath:new-spring-context.xml"})
@TestPropertySource("classpath:app.properties")
public class ReportingServiceTest {

}
