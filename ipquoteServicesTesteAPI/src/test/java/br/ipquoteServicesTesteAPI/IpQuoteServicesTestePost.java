package br.ipquoteServicesTesteAPI;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;

import org.junit.Test;
import org.jvnet.staxex.StAxSOAPBody.Payload;

import br.intelipost.until.JsonMessage;

public class IpQuoteServicesTestePost {

	private String url = "http://localhost:8080/v2/quote/async";

	
	@Test
	public void MustSaveQuoteWithOneCompleteProduct() throws IOException {

		given()
				.log().all().contentType("application/json")

				.body(JsonMessage.getMessage("/Json/payload.json"))

				.when().post(url)

				.then()

				.log().all();
		
				 /* statusCode(202).body("id", is(notNullValue()))
				.body("identification.session", is("04e5bdf7ed15e571c0265c18333b6fdf1434658753"))
				.body("identification.ip", is("000.000.000.000")).body("identification.pageName", is(nullValue()))
				.body("identification.url", is("http://www.intelipost.com.br/checkout/cart/"))
				;*/
	}


	
}

