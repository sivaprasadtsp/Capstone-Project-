package com.sportyshoe.restassuredscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetAllshoes {
@Test (priority='1')
public void get_all_Shoes()
{
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/get-shoes")
	.when()
	.get()
	.then()
	.statusCode(200)
	.log().all();
}
@Test (priority='2')
public void get_all_users()
{
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/get-users")
	.when()
	.get()
	.then()
	.statusCode(200)
	.log().all();
}
}
