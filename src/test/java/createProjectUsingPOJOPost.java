import java.util.Random;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import projectLibrary.ProjectLibrary;

public class createProjectUsingPOJOPost {
	
	@Test
	public void createProject()
	{
		Random r=new Random();
		int ran = r.nextInt();
		
		//Step1: create pre requisities
		ProjectLibrary pLib=new ProjectLibrary("Harendra", "TYSS", 201, 25);
		
		baseURI="http://localhost";
		port=8084;
		
				
	   given()
	   .body(pLib)
	   .contentType(ContentType.JSON)
	   .when()
	   .post("/addProject")
	   .then()
	   .log().all();
	   
	   
		
	
	}

}
