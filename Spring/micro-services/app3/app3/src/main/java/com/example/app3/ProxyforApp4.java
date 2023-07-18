package com.example.app3;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="app4", url="http://localhost:9093")
public interface ProxyforApp4 
{
	@RequestMapping("service2")
	public String service2();
//	method name can be different from the actual service name
	
	@RequestMapping("service2")
	public String test1();
}
