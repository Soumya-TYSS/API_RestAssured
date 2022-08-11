import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerialozationAndDeserialization.Employee3;

public class DeserialisationEmployee3 {
	
	@Test
	public void deseralizationTest() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper ob=new ObjectMapper();
		Employee3 em3 = ob.readValue(new File(".\\Employee3.json"), Employee3.class);
		
		System.out.println(em3.getPhno()[2]);
		System.out.println(em3.getS().getName());
		
	}
	
	
	
	
	
	
       
}
