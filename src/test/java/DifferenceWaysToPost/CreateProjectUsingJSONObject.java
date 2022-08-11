package DifferenceWaysToPost;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectUsingJSONObject {
	
	@Test
	public void createProject()
	{
		Random r=new Random();
		int ran = r.nextInt();
		
		String[] email1={"abc@gmail.com","xyz@gmail.com"};
		
		//Step1: Create data 
		
		JSONObject ob=new JSONObject();
		ob.put("sname", "soumya");
		ob.put("no", 123);
					
		JSONObject obj=new JSONObject();
		obj.put("createdBy", "vish");
		obj.put("projectName", "Allstates"+ran);
		obj.put("status", 201);
		obj.put("teamSize", 100);
		obj.put("email", email1);
		obj.put("spouse", ob);
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(obj)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		//.assertThat()
		//.statusCode(201)
		.log().all();
		
		
		
	}

}
