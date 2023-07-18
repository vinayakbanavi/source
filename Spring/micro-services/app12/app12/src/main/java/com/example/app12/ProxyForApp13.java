package com.example.app12;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// app14 Api GateWay 
@FeignClient(name="app14")
public interface ProxyForApp13
{
	@RequestMapping("app13/service2")
	public String callService2();
}

/*
 		microservice1(app12) ----> ApiGateway(app14) ----> microservice2(app13)
 		http://localhost:9099/app12/service1
*/