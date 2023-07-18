package pack2;

import static org.junit.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

public class TestSingleton 
{
	
	@Test
	public void testSingleton()
	{
	
		Logger logger = LogManager.getLogger(TestSingleton.class);
		
		logger.info("test case started");
		
		logger.info("Requesting Singleton instance for obj1");
		Singleton obj1 = Singleton.getInstance();
		
		logger.info("requesting Singleton instance for obj2");
		Singleton obj2 = Singleton.getInstance();
		
		logger.info("checking whether obj1 and obj2 refer to the same object");
		assertEquals(obj1, obj2);
		
	}
}
