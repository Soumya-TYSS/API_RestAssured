package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject {
	
	@Test
	public void updateProjectTest()
	{
		
		//step1:  create data
		JSONObject job=new JSONObject();
		job.put("createdBy", "Vismaya");
		job.put("projectnName", "kiboko 155");
		job.put("statuc", "on-Going");
		//job.put("teamSize", 20);
		
		//step2: send the request
		RequestSpecification req = RestAssured.given();
	    req.body(job);
	    req.contentType(ContentType.JSON);
	    
	    Response resp = req.put("http://localhost:8084/projects/TY_PROJ_626");
	
	   //step3: validate response
	    resp.then().log().all();
	}

}
