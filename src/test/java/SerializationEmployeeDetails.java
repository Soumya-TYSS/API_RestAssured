import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerialozationAndDeserialization.EmployeeDetails;

public class SerializationEmployeeDetails {
	
	@Test
	public void serialisationEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		//Step1: create object for Pojo class and provide values
		EmployeeDetails emp= new EmployeeDetails("Soumya", "TY123", 12344, "pai@ty.com", "Bangalore");
		
		//Step2: Create object of Object Mapper from Jackson Mapper
         ObjectMapper obj=new ObjectMapper();
         
         //Step3: write data into json file
         obj.writeValue(new File("./EmployeeDetails.json"), emp);         
		
		
	}

}
