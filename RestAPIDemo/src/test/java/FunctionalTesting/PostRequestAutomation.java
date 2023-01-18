package FunctionalTesting;


import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;


public class PostRequestAutomation {

	@Test
	public void postAPIAutomation() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/create";
		RestAssured.given().body("{\n" + 
							"   name\":\"Samiran\",\n" +
							"	salary\":\"1234\",\n" + 
							"	age\":\"41\n" +
							"}").post().then()
							.log()
							.all()
							.assertThat()
							.statusCode(200);		
	}
	
}
