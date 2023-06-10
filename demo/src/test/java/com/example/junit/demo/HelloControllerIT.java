package com.example.junit.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import static org.junit.jupiter.api.Assertions.*;


public class HelloControllerIT {

    @Mock
    private TestRestTemplate template;

    @BeforeAll
    public void init(){
        MockitoAnnotations.initMocks(this);

    }
    @Test
    public void getHello() throws Exception {
       // Mockito.when(template.getForEntity("/", String.class));
        //ResponseEntity<String> response = template.getForEntity("/", String.class);
        //assertEquals(response.getBody(), "Greetings from Spring Boot!");
    }
}
