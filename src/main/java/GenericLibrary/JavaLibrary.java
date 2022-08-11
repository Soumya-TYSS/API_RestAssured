package GenericLibrary;

import java.util.Random;

import org.testng.annotations.Test;

/**This class contains all java specific Generic Methods
 * 
 * @author sheno
 *
 */
public class JavaLibrary {
	
	/**
	 * This method will generate Random Number for every Execution
	 * @return
	 */
	
	public int getRandomNumber()
	{
		Random r=new Random();
		return r.nextInt(2000);
	}
	
	
			
}
