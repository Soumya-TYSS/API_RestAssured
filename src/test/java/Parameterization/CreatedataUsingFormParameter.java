package Parameterization;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreatedataUsingFormParameter {
	
	
	@Test
	public void createDataUsingParameter()
	{
           baseURI="https://reqres.in/";
           JSONObject ob=new JSONObject();
           ob.put("name", "morpheus1");
           ob.put("job", "Senior Software Engineer");
           
           
           given()
           //.formParam("name", "morpheus1")
           //.formParam("job", "Senior Software Engineer")
           .body(ob)
           .contentType(ContentType.JSON)
           
           
           .when()
           .post("api/users")
           
           .then()
           .log().all();
           
                
           
	}

}
