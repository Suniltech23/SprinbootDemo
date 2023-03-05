package com.example.day1;

import com.example.day1.controller.HelloController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;

public class HelloTest extends  Day1ApplicationTests{
    @Autowired
    HelloController helloController;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void return1(){
        Assertions.assertThat(helloController).isNotNull();
    }
    @Test
    void return1Test() {
        Assertions.assertThat(restTemplate
                .getForObject("http://localhost:8080" +  "/", String.class));
    }

}
