package com.grubhub.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerIT {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads(){
        String response = restTemplate.getForObject("/users", String.class);
        assertEquals("[{\"id\":1,\"firstName\":\"Bhavesh\",\"lastName\":\"Patel\"}]", response);
    }
}
