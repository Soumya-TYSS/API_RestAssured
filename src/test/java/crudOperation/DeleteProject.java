package crudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProject {
	
	@Test
	public void deleteProjectTest()
	{
		//step1: create required data
		
		//step2: Send the request
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_626");
	
		//step3: validate response
	    ValidatableResponse validate = resp.then();
		resp.then().log().all();
	
	}

}
