package EndToEndScenarios;

import org.json.simple.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.DataBaseLibrary;
import GenericLibrary.EndPointsLibrary;
import GenericLibrary.Iconstants;
import GenericLibrary.JavaLibrary;
import GenericLibrary.RestAssuredLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import projectLibrary.ProjectLibrary;

public class CreateProjectVerifyInDataBase extends BaseAPIClass {
	
	//JavaLibrary jLib=new JavaLibrary();--->because already created in baseclass again in DB it will 
	//through null pointer exception
	//RestAssuredLibrary rLib=new RestAssuredLibrary();
	
	@Test
	public void createProjectANdVerifyInDBTest() throws SQLException
	{
		//int ran=jLib.getRandomNumber();
		
		//step 1:create the pre requisites
	
		ProjectLibrary pLib=new ProjectLibrary("Pai", "TYSS"+jLib.getRandomNumber(), 201, 25);
		
		//step2: send the request
		Response resp = given()
		.body(pLib)
		.contentType(ContentType.JSON)
		.when()
		.post(EndPointsLibrary.createProject);
		
		//.then().assertThat().statusCode(201).log().all();
		
		//step3: capture the project ID
		String expData = rLib.getJSONData(resp, "projectId");
		Reporter.log(expData,true);
				
		//step4: validate the Projectid in DataBase
	     String actdata = dLib.readDataFromDBAndValidate(Iconstants.query, 1, expData);
	     
		Assert.assertEquals(expData,actdata);
		
	}
	
		
}
