package com.xinwei.eureka.client.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xinwei.eureka.client.domain.HelloTestInfo;
import com.xinwei.eureka.client.domain.HelloTestResult;

@RestController
public class HelloEurekaClientController {

	@Value("${server.port}")
	private String port;

	@RequestMapping("/hello")
	public String hello(@RequestParam String name, HttpServletRequest request) {
		String retMsg = "hello " + name + ", i am from port:" + port + "<br/><br/>";
		retMsg += "######################## Headers ######################<br/>";
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String str = (String) headerNames.nextElement();
			retMsg += "headerKey:" + str + ",headerValue:" + request.getHeader(str) + "<br/>";
		}
		System.out.println(retMsg);
		return retMsg;
	}

	@RequestMapping("/helloTest/{uid}")
	public HelloTestResult helloTest(@PathVariable("uid") String uid, @RequestBody HelloTestInfo helloTestInfo) {
		String retMsg = "uid " + uid + ", helloTestInfo = " + helloTestInfo;
		HelloTestResult result = new HelloTestResult();
		result.setReturnMsg(retMsg);
		System.out.println(retMsg);
		return result;
	}
}
