package steps;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;

public class Script002 {
	@Test(priority = '1')
	@Given("Add new product")
	public void add_new_product() {
	  
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge.com")
		.queryParam("name","Nike")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2000")
		.when()
		.post()
		.then()
		.log().all();
		
		
	}
    @Test(priority= '2')
	@Given("Update new product")
	public void update_new_product() {
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-shoe")
		.queryParam("id","1020")
		.queryParam("image", "www.imge123.com")
		.queryParam("name","Reebok")
		.queryParam("category", "Running")
		.queryParam("sizes","5,6,7")
		.queryParam("price", "2500")
		.when()
		.put()
		.then()
		.log().all();
		
		
		
	}
    @Test(priority = '3')
	@Given("delete new product")
	public void delete_new_product() {
	  
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-shoe")
		.queryParam("id", "1020")
		.when().delete()
		.then().log().all();
		
		
	}


}
