package requestChaining;

import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import projectLibrary.ProjectLibrary;

public class CreateProGetProANdDeletePro {
	
	@Test
	public void requestChaining1Test()
	{
		//step1: create a project using POJo
		Random r=new Random();
		int ran = r.nextInt(500);
		
		ProjectLibrary pLib=new ProjectLibrary("Swathi", "TYSS"+ran, 201, 25);
		baseURI="http://localhost";
		port=8084;
		
		Response resp =given()
		.body(pLib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		
		//capture the project id
		Object proId = resp.jsonPath().get("projectId");
		System.out.println(proId);
		resp.then().log().all();
		
		//get request and pass proID as path parameter 
		given()
		.pathParam("pid", proId)
         .when()
         .get("/projects/{pid}")
         .then().log().all();
		
		//delete request and pass proID as path parameter
		given()
		.pathParam("pid", proId)
		.delete("/projects/{pid}")
		.then().log().all();
		
       /*
		//get again 
		given()
		.pathParam("pid", proId)
         .when()
         .get("/projects/{pid}")
         .then().log().all();
		
		*/
	}

}
