package br.ipquoteServicesTesteAPI;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class IpQuoteServicesTesteGet {

	@Test
	public void teste() {
	Response response = RestAssured.request(Method.GET,"http://localhost:8080/v2/quote/clientid=1");
	System.out.println(response.getBody().asString());
	}

}




