import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerialozationAndDeserialization.EmployeeDetails;
import PojoForSerialozationAndDeserialization.EmployeeDetailsWithArray;

public class SerializationPart2 {
	
	int ph[]= {1234, 213243};
	String emailid[]= {"soumya@gmail.com", "pai@ty.com"};
	
	@Test
	public void serializingTest() throws JsonGenerationException, JsonMappingException, IOException
	{
		
	  //Step1: create object for Pojo class and provide values
	  EmployeeDetailsWithArray empa=new EmployeeDetailsWithArray("Soumya", "TY123", ph, emailid, "Bangalore");
		
	//Step2: Create object of Object Mapper from Jackson Mapper
      ObjectMapper obj=new ObjectMapper();
      
      //Step3: write data into json file
      obj.writeValue(new File("./EmployeeDetailsWithArray.json"), empa);         
		
	}

}
