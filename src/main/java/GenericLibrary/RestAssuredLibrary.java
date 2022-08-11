package GenericLibrary;

import org.testng.annotations.Test;

import io.restassured.response.Response;

/**
 * This Class contains RestAssured Specific Reusable methods
 * 
 * @author sheno
 *
 */
public class RestAssuredLibrary {
	
	/**
	 * this method will get the json data through json path from the reponse body 
	 * @param response
	 * @param path
	 * @return
	 */
	public String getJSONData(Response response, String path)
	{
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}
	

}
