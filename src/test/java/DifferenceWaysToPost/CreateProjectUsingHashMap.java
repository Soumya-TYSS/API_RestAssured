package DifferenceWaysToPost;

import java.util.HashMap;
import java.util.Random;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProjectUsingHashMap {
	
	@Test
	public void createProject()
	{
		Random r=new Random();
		int ran = r.nextInt();
		
		//Step 1: create pre requisites
		HashMap map=new HashMap();
		map.put("createdBy", "Baanuakka");
		map.put("projectName", "Allstates"+ran);
		map.put("status", 201);
		map.put("teamSize", 100);
		
		given()
		.body(map)
		.contentType(ContentType.JSON)
		
		
		.when()
		.post("/addProject")
		
		.then()//.assertThat().statusCode(210)
		.log().all();
		
		
	}

}
