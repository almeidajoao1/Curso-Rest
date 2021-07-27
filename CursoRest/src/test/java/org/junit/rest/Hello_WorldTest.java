package org.junit.rest;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.junit.Test;

public class Hello_WorldTest {
	
	@Test	
	public void devoValidarBody() {
		given()
		.when()
			.get("http://restapi.wcaquino.me/ola")
		.then()
			.statusCode(200)
			.body(Matchers.is("Ola Mundo!"))
			.body(Matchers.containsString("Mundo"));
	}
}