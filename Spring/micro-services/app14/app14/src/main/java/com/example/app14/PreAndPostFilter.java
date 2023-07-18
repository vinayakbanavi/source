package com.example.app14;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Configuration
public class PreAndPostFilter implements GlobalFilter
{
//	@Override
//	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain)
//	{
//		System.out.println("pre--->");
//		Mono<Void> response = chain.filter(exchange);
//		System.out.println("post--->");
//		return response;
//	}
	
	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		
		Mono<Void> response = chain.filter(exchange);
		return response;
	}
}
