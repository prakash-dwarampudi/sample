package com.sample;

import javax.jws.WebService;

@WebService(endpointInterface="com.sample.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	public String getString() {
		return "Hello World";
	}

}
