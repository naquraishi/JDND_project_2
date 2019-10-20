package com.udacity.pricing;

import com.udacity.pricing.api.PricingController;
import com.udacity.pricing.domain.price.PriceRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import java.net.URI;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PricingServiceApplicationTests {

	@Autowired
	PriceRepository priceRepository;


	@Autowired
	MockMvc mvc;

	@Test
	public void contextLoads() {
	}

	@Test
	public void servicesTest() throws Exception {

		mvc.perform(
				get(new URI("/services"))
						.contentType(MediaType.APPLICATION_JSON_UTF8)
						.accept(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());

	}


}
