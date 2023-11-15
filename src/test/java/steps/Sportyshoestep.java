package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;

public class Sportyshoestep {

@Given("User send a Get request to get all products available")
public void user_send_a_get_request_to_get_all_products_available() {
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/get-shoes")
	.when()
	.get()
	.then()
	.statusCode(200)
	.log().all();
}

@Given("User sends a Get request to get all register users")
public void user_sends_a_get_request_to_get_all_register_users() {
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/get-users")
	.when()
	.get()
	.then()
	.statusCode(200)
	.log().all();
}

@Given("User sends a Post Request to send to details")
public void user_sends_a_post_request_to_send_to_details() {
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/add-shoe")
	.queryParam("id","1050")
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

@Given("user sends a Put Request to update")
public void user_sends_a_put_request_to_update() {
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/update-shoe")
	.queryParam("id","1050")
	.queryParam("image", "image_url")
	.queryParam("name","SampleShoe")
	.queryParam("category", "Running")
	.queryParam("sizes","9,8,6,7")
	.queryParam("price", "1000")
	.when()
	.put()
	.then()
	.log().all();
}

@Then("user sends a Delete Request to delete")
public void user_sends_a_delete_request_to_delete() {
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/delete-shoe")
	.queryParam("id", "1051")
	.when().delete()
	.then().log().all();
}
}
