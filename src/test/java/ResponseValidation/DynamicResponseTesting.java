package ResponseValidation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseTesting {
	
	@Test
	public void dynamicResponse()
	{
		//pre requites
		String expData="TY_PROJ_610";
		baseURI="http://localhost";
		port=8084;
		
		//Action
		Response resp = when()
		.get("/projects");
		
		//validation
		boolean flag=false;
		List<String> pidS = resp.jsonPath().get("projectId");
		for(String projectId:pidS)
		{
			if(projectId.equalsIgnoreCase(expData))
			{
				flag=true;
				
			}
				
		}
	
		Assert.assertTrue(flag);
		System.out.println("data verified");
		
		resp.then().log().all();
	}

}
