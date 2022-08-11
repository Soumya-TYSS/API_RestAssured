import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import PojoForSerialozationAndDeserialization.Employee3;
import PojoForSerialozationAndDeserialization.SoupseDetails;

public class SerialisationForEmployee3 {
	
	int[] phno= {23536376, 454653};
	String[] email= {"souih@gmail.com", "gjhasgh@gmail.com"};
	
	
	@Test
	public void serializationTest() throws JsonGenerationException, JsonMappingException, IOException
	{
	    SoupseDetails sdj=new SoupseDetails("Vish", 466, 32);
	    		
		Employee3 emp=new Employee3("Soumya", "Ty123", phno, email, "Bangalore", sdj);
		
		ObjectMapper obj=new ObjectMapper();
		
		obj.writeValue(new File("./Employee3.json"), emp);
	}

}
