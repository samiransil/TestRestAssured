package FunctionalTesting;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.response.Response;

public class UpdateDeleteRequestAutomation {
	
	//@Test
	public void updateAPIAutomation() {
		
		
		JSONObject request = new JSONObject();
		request.put("name", "test");
		request.put("salary", "123");
		request.put("age", "23");
		
		given().
			header("Content-Type","application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("https://dummy.restapiexample.com/api/v1/update/21").
		then().
			statusCode(200).log().all();
		
	}
	
		@Test
		public void deleteAPIAutomation() {
			
			when().
				delete("https://dummy.restapiexample.com/api/v1/delete/2").
			then().
				statusCode(200).log().all();
			
		}


}
