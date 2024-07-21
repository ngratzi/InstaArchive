package com.instaarchive;

import com.instaarchive.service.InstagramPostDownloadService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
@RequiredArgsConstructor
public class InstaRunner implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger(InstaRunner.class);
    private final InstagramPostDownloadService instagramPostDownloadService;

    @Override
    public void run(String... args) throws Exception {
        // Start the clock
        long start = System.currentTimeMillis();

        // Kick of multiple, asynchronous lookups
        CompletableFuture<?> page1 = instagramPostDownloadService.getInstaPost();

        // Wait until they are all done
        CompletableFuture.allOf(page1).join();

        // Print results, including elapsed time
        logger.info("Elapsed time: " + (System.currentTimeMillis() - start));
        logger.info("--> " + page1.get());
    }
}
