package com.spinalski.stylist.api;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spinalski.stylist.model.Stylist;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class StylistsApiControllerTest {

	@Autowired
	private WebTestClient webClient;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void testPostStylist() throws Exception {
		Stylist stylist = new Stylist();
		stylist.setEmail("email1@stylist.com");
		stylist.setName("NAME1");

		webClient.post().uri("/stylists").contentType(MediaType.APPLICATION_JSON)
				.syncBody(objectMapper.writeValueAsString(stylist)).exchange().expectStatus().is2xxSuccessful()
				.expectBody().returnResult().equals("1");
	}

	@Test
	public void testGetStylists() throws Exception {
		webClient.get().uri("/stylists").accept(MediaType.APPLICATION_JSON).exchange().expectStatus().isOk()
		.expectHeader().contentType(MediaType.APPLICATION_JSON_UTF8)
        .expectBody();
	}
}
