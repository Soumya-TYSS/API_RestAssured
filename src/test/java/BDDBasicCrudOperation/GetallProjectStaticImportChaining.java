package BDDBasicCrudOperation;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetallProjectStaticImportChaining {
	
	@Test
	public void getAllProjectTest()
	{
		baseURI ="http://localhost";
				port=8084;
				
		//step1: create data
		
		//step2: send the request and validate response
		when()
		.get("/projects")
		.then()
		.log().all();
		
	}

}
