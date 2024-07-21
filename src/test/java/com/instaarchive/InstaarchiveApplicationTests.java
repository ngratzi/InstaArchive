package com.instaarchive;

import com.instaarchive.service.InstagramPostDownloadService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class InstaarchiveApplicationTests {

	@Mock
	private RestTemplate restTemplate;

	@InjectMocks
	private InstagramPostDownloadService instagramLookupService;

	@Test
	void contextLoads() {
	}

}
