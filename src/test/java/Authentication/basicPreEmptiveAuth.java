package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class basicPreEmptiveAuth {
	
		
	@Test
	public void basicPreEmptiveAuthTest()
	{
	
		baseURI="http://localhost";
		port=8084;
		
		given()
		.auth().preemptive().basic("rmgyantra", "rmgy@9999")

		.when()
		.get("/login")
		
		.then()
		.log().all();
		
}
}
