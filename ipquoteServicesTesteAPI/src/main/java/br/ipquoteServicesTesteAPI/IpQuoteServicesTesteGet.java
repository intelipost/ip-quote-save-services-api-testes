package br.ipquoteServicesTesteAPI;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class IpQuoteServicesTesteGet {

	public static void main(String[] args) {
		
		
		Response response = RestAssured.request(Method.GET,"http://localhost:8080/v2/quote/123");
		System.out.println(response.getBody().asString());

	}

}
