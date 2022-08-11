package Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class BearerTokenT {
	
	@Test
	public void bearerTokenTest()
	{
		baseURI="https://api.github.com";
		
		
		//pre reuisites
		HashMap map=new HashMap();
		map.put("name", "abc");
		map.put("description", "nothing much to tell");
		
		given()
		.auth()
		.oauth2("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")
		.body(map)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/user/repos")
		.then().log().all();
		
	}

}
