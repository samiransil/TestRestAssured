package FunctionalTesting;

import javax.annotation.meta.When;
import javax.xml.crypto.Data;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;

public class GetRequestAutomation {
	
	@Test
	public void getRequestAutomation() {
//		
//		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees/9570";
//		Response response = RestAssured.given().param("id", "9309").when().get();
//		System.out.println("getStatusCode:-" + response.getStatusCode());
//		System.out.println("Samiran Sil");
//		System.out.println(response.then().assertThat().log()
//				.all()
//				.statusCode(200));
		
		
		
		Response response = RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		System.out.println(response.getStatusCode());
		System.out.println(response.getBody().asPrettyString());
		System.out.println("Samiran");
		
		Response response1 = RestAssured.get("https://dummy.restapiexample.com/api/v1/employee/1");
		System.out.println(response1.getStatusCode());
		System.out.println(response1.getBody().asPrettyString());
		System.out.println("Sil");
		
	}
	
}
