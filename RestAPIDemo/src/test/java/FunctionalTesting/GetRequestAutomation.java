package FunctionalTesting;

import javax.annotation.meta.When;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;

public class GetRequestAutomation {
	
	@Test
	public void getRequestAutomation() {
		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees";
		Response response = RestAssured.given().param("id", "1").when().get();
		System.out.println("getStatusCode:-" + response.getStatusCode());
		System.out.println("Samiran Sil");
		System.out.println(response.then().assertThat().log().all().statusCode(200));
	}
	
}
