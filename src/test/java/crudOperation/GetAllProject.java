package crudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProject {

	
	@Test
	public void getAllProjectTest()
	{
		//step1: create required data
		
		//step2: Send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");
	
		//step3: Validate the reponse
		ValidatableResponse validate = resp.then();
	    validate.log().all();
	}
}
