package pack2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Singleton 
{
	private static Singleton obj;

	private static Logger logger = LogManager.getLogger(Singleton.class);
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		logger.info("From SingleTon instance requested");
		
		if(obj == null)
		{
			obj = new Singleton();
		}
		
		return obj;
	}
}
