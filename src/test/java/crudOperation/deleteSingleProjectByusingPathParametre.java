package crudOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class deleteSingleProjectByusingPathParametre {
	
	@Test
	public void deleteSingleProjectByusingPathParametreTest()
	{
		JSONObject obj=new JSONObject();
		
		
		RequestSpecification req = RestAssured.given();
		//req.pathParam("projectnName", {kiboko163});
	//	req.pathParam("ProjectName", "kiboko 163");
		//req.pathParam("ProjectId", "TY_PROJ_615");
		
		//send request
		Response res = RestAssured.delete("http://localhost:8084/projects/{projectnName}");
		
		//validate the response
	       ValidatableResponse validate = res.then();
	       validate.log().all();
	}

}
