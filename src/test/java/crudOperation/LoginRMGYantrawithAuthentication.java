package crudOperation;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantrawithAuthentication {
	
	@Test
	public void loginRMGYantrawithAuthenticationTest()
	{
		
		RequestSpecification req = RestAssured.given();
		req.auth().basic("rmgyantra", "rmgy@9999");
		Response res = req.get("http://localhost:8084/login");
	    ValidatableResponse validate = res.then();
	    validate.log().all();
		//	req.auth().basic("rmgyantra", "rmgy@9999").get("http://localhost:8084/login").then().log().all();
	//	req.contentType("application.JSON");
		//RequestSender login = RestAssured.when();
					//Response resp = login.get("http://localhost:8084/login");
		//ValidatableResponse validate = resp.then();
		//validate.log().all();
					
	}

}
