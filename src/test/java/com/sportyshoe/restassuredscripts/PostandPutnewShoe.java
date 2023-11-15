package com.sportyshoe.restassuredscripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PostandPutnewShoe {
	@Test(priority='1')
	public void add_new_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1051")
		.queryParam("image", "image_url")
		.queryParam("name","SampleShoe")
		.queryParam("category", "Running")
		.queryParam("sizes","9")
		.queryParam("price", "1000")
		.when()
		.post()
		.then()
		.log().all();
		
}
	
	
	@Test(priority='2')
	public void update_a_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1051")
		.queryParam("image", "image_url")
		.queryParam("name","SampleShoe")
		.queryParam("category", "Running")
		.queryParam("sizes","9,8,6")
		.queryParam("price", "1000")
		.when()
		.put()
		.then()
		.log().all();
		
}

	@Test(priority='3')
	public void delete_product()
	{
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1051")
		.when().delete()
		.then().log().all();
	
}
}
