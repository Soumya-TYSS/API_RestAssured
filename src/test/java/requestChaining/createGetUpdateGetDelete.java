package requestChaining;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import projectLibrary.ProjectLibrary;

import static io.restassured.RestAssured.*;

import java.util.Random;

public class createGetUpdateGetDelete {
	
	
	@Test
	public void createUpdateGetDeleteTest()
	{
		Random r=new Random();
		int ran=r.nextInt(3000);
				
		baseURI="http://localhost";
		port=8084;
		
		//create data
		ProjectLibrary pLib=new ProjectLibrary("pai", "TYSS"+ran, 201, 25);
		
		Response resp = given()
		.body(pLib)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject");
		
		//capture the project id
		String projectId = resp.jsonPath().get("projectId");
		System.out.println(projectId);
		resp.then().log().all();
		
		//get request and pass proID as path parameter 
		given()
		.pathParam("pId", projectId)
		.when()
		.get("/projects/{pId}")
		.then().assertThat().statusCode(200).log().all();
		
		//update request and pass proID as path parameter 
		ProjectLibrary pLib1=new ProjectLibrary("Soumya", "TYSS"+ran, 201, 25);
		given()
		.pathParam("pId", projectId)
		.body(pLib1)
		.contentType(ContentType.JSON)
		.when()
		.put("/projects/{pId}")
		.then().log().all();
		 
		//get request and pass proID as path parameter 
		given()
		.pathParam("pId", projectId)
		.when()
		.get("/projects/{pId}")
		.then().assertThat().statusCode(200).log().all();
		
		//delete request and pass proID as path parameter
		given()
		.pathParam("pId", projectId)
		.when()
		.delete("/projects/{pId}")
		.then().log().all();
		
	}

}
