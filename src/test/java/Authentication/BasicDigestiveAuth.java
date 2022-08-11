package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BasicDigestiveAuth {
	
	@Test
	public void basicDigestiveAuthTest()
	{
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth().digest("rmgyantra", "rmgy@9999")
		
		.when()
		.get("/login")
		
		.then()
		.log().all();
		
	}

}
