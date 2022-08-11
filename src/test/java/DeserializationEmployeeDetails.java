import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerialozationAndDeserialization.EmployeeDetails;

public class DeserializationEmployeeDetails {
	
	@Test
	public void deserializationTest() throws JsonParseException, JsonMappingException, IOException
	{
		//Step1: create object of Object Mapper class comes from Jackson Mapper tool
		ObjectMapper obj=new ObjectMapper();
		
		//Step2: read the value from Object Mapper
		EmployeeDetails e1 = obj.readValue(new File(".\\EmployeeDetails.json"), EmployeeDetails.class);
		
		//Step3: fetch the required value from class
		System.out.println(e1.geteName());
		System.out.println(e1.getPhone());
				
	}

}
