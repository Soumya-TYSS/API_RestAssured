package GenericLibrary;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class BaseAPIClass {
	
	public DataBaseLibrary dLib=new DataBaseLibrary();
	public JavaLibrary jLib=new JavaLibrary();
	public RestAssuredLibrary rLib=new RestAssuredLibrary();
	
	@BeforeSuite
	public void bsConfig() throws SQLException
	{
		dLib.connectionToDB();
		Reporter.log("=====Connection successful===", true);
		baseURI = Iconstants.baseURI;
		port=Iconstants.port;
	}

	@AfterSuite
	public void asConfig() throws SQLException
	{
		dLib.closeDB();
		Reporter.log("======Connection closed====", true);
	}
	
	
}
