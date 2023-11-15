package steps;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class Script001 {

@Test(priority= '1')
@Given("User send a Post request to create a user and validates status")
public void user_send_a_post_request_to_create_a_user_and_validates_status() {
	
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/get-shoes")
	.when()
	.get()
	.then()
	.statusCode(200)
	.log()
	.all();
	

}


@Given("User sends a Get request to get a user and validates status")
public void user_sends_a_get_request_to_get_a_user_and_validates_status() {
	RestAssured.given()
	.baseUri("http://localhost:9010")
	.basePath("/get-users")
	.when()
	.get()
	.then()
	.statusCode(200)
	.log()
	.all();
	
	
    
}

}
