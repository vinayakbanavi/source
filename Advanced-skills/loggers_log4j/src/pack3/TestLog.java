package pack3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog 
{
	
	private static Logger logger = LogManager.getLogger(TestLog.class);
	
	public static void main(String[] args) 
	{
//		if we don't provide configuration default level will be set as ERROR

		logger.trace("trace level information");
		logger.debug("debug level information");
		logger.info("info level information");
		logger.warn("warn level information");

		//So we will get logs of Error and down the line
		logger.error("by default error will be choosed as a level");
		logger.fatal("fatal level information");
		
		
		
	}
}
