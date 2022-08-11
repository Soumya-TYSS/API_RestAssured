import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerialozationAndDeserialization.EmployeeDetailsWithArray;

public class DeserializationForArray {
	
	@Test
	public void deserializationTest() throws JsonParseException, JsonMappingException, IOException {
		//Step1: create object of Object Mapper class comes from Jackson Mapper tool
				ObjectMapper obj=new ObjectMapper();
				
	   //Step2: read the value from Object Mapper
				EmployeeDetailsWithArray ed=obj.readValue(new File(".\\EmployeeDetailsWithArray.json"), EmployeeDetailsWithArray.class);
				
				//Step3: fetch the required value from class
				//int[] phnoarrey = ed.getPhno();
				System.out.println(ed.getEmail()[0]);
				System.out.println(ed.getPhno()[1]);
		
	}

}
