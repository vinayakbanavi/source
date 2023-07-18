package com.lara.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("project")
public class WebController
{
	
//	logging the information
	
/*
 	properties based logger configuration
 	default : Level = info , dest = console
 	Fatal << Error << Warn << Info << debug << trace 
 	
 	 
 */
	
	private static Logger logger = LogManager.getLogger(WebController.class);
	
	@GetMapping("test1")
	public String test1()
	{
		logger.trace("trace level");
		logger.debug("debug level");
		logger.info("info level");
		logger.warn("warn level");
		logger.error("error level");
		logger.fatal("fatal level");
		return "Test1 resources";
	}
	
	@GetMapping("test2/{input}")
	public String test2(@PathVariable String input)
	{
		logger.info("user requested test2 with input : " + input);
		return "Test2 resources";
	}
}
