package Parameterization;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParameter {
	
	@Test
	public void getSingleProject()
	{
		//pre requites
		baseURI="http://localhost";
		port=8084;
		
		given()
		.pathParam("pid", "TY_PROJ_1204")
		
		//Actions
		.when()
		.get("/projects/{pid}")
		
		//validations
		.then()
		.log().all();
		
		
	}

}
