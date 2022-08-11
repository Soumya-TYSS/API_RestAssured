package BDDBasicCrudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostusingStaticImportandChaining {
	
	@Test
	public void createProjectTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		//step1: create data
		JSONObject obj=new JSONObject();
		obj.put("createBy", "Pai");
		obj.put("projectName", "RMG");
		obj.put("status", "created");
		//obj.put("teamsize", 30);
		
		//step2: send the request
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
				
		.then()   //step3: validate the response
		.log().all();
	}

}
