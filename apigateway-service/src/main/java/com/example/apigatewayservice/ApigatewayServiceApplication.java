package com.example.apigatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
//import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;


@SpringBootApplication
public class ApigatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApigatewayServiceApplication.class, args);
    }

//    @Bean
//    public HttpTraceRepository httpTraceRepository() {
//        return new InMemoryHttpTraceRepository();
//    }
}
