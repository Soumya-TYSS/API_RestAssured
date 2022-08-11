package crudOperation;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {
	
	@Test
	public void createProjectTest()
	{
		//create random number
		Random r= new Random();
	     int ran = r.nextInt(500);
	     
	     //Step1: create necessary data
	     JSONObject obj=new JSONObject();
	     obj.put("createdBy", "Soumya");
	     obj.put("projectnName", "kiboko"+ran);
	     obj.put("statuc", "created");
	     
	     //Step2: send the request
	     RequestSpecification request = RestAssured.given();
	     request.body(obj);
	     request.contentType(ContentType.JSON);
	     
	     Response resp = request.post("http://localhost:8084/addproject");
	     
	     //Step3: Validate the reponse
	    //System.out.println(resp.prettyPeek());
	     
	     ValidatableResponse validate = resp.then();
	     validate.log().all();
	    
	       
	}

}
