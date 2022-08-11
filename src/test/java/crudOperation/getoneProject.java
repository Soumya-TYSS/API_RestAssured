package crudOperation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getoneProject {
	
	
	@Test
	public void getoneProject()
	{
		baseURI ="http://localhost";
		port=8084;
		
		//step1: crea	te data

		//step2: send the request and validate response
		when()
		.get("/projects")
		.then()
		.log().all();

	}

}
