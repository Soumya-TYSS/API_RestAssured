package DifferenceWaysToPost;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;


public class CreateProjectUsingJSONfile {
	
	@Test
	public void createProject()
	{
		//step1: create pre requisites
		File f=new File(".\\src\\test\\resources\\data.JSON");
//right click on file -->after project in properties copy all the path
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(f)
		.contentType(ContentType.JSON)
		.when()
		.post("/addProject")
		.then()
        .log().all();		
		
		
		
	}

}
