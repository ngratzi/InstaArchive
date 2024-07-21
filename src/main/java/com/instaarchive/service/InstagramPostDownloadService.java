package com.instaarchive.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class InstagramPostDownloadService {

    private static final Logger logger = LoggerFactory.getLogger(InstagramPostDownloadService.class);

    private final RestTemplate restTemplate;

    public InstagramPostDownloadService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    @Async
    public CompletableFuture<?> getInstaPost() throws InterruptedException {
        logger.info("Retrieving Post...");
//        String url = String.format("https://www.instagram.com/api/v1/feed/saved/posts/?hl=en", user);
//        User results = restTemplate.getForObject(url, User.class);
        return CompletableFuture.completedFuture("");
    }
}
