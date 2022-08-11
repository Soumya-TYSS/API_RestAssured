package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidationGet {
	
	@Test
	public void staticResponsegetTest()
	{
		//prerequisites
		String expData="TY_PROJ_1204";
		baseURI="http://localhost:8084";
		
		//action
		Response resp = when()
		.get("/projects");
		
		//validation
		String actData = resp.jsonPath().get("[3].projectId");
		System.out.println(actData);
		Assert.assertEquals(actData, expData);
		System.out.println("data verified");
		resp.then().log().all();
	}

}
