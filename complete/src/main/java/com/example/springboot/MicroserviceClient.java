package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MicroserviceClient {

    private final RestTemplate restTemplate;

    @Autowired
    public MicroserviceClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getMicroserviceData() {
        String url = "http://localhost:7000/";  // Replace with your microservice URL
        return restTemplate.getForObject(url, String.class);
    }
}
