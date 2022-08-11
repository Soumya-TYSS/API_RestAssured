package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

public class Oauth2_0 {
	
	@Test
	public void oauthAuthentication()
	{
		baseURI="http://coop.apps.symfonycasts.com";
		
		
		//Step1: create a request to genereate access token
		 Response resp = given()
		.formParam("client_id","GoldenEgg")
		.formParam("client_secret", "22537f40e9d4bff5447bba9e86afa8f3")
		.formParam("grant_type","client_credentials")
		.formParam("redirect_uri", "http://name.com")
		.formParam("code","authorization code")
		
		.when()
		.post("/token");
		
		//step2: capture the access token using JSONPath
		String token = resp.jsonPath().get("access_token");
		System.out.println(token);
		
		//Step3: utilize the access token
		given()
		.auth()
		.oauth2(token)
		.pathParam("User Id",3667)
		.when()
		.post("/api/{User Id}/chickens-feed")
		.then().assertThat().statusCode(200)
		.log().all();
				
	}

}
