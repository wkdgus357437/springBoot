package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //이걸 쓰면 ResponsBody를 안써도 된다.
public class HelloController {
	
	public HelloController() {
		System.out.println("HelloController 기본 생성자");
	}
	@GetMapping(value="hello")
	//@ResponseBody
	// 콜백 메소드 - 스프링 컨테이너가 어떤 시점이 되면 자동으로 호출하는 메소드
	//어떤시점 : http://locathost:8080/hello 가 될때 
	public String hello(String name) {
		return "안녕하세요"+ name + "님";
	}
	
	
	
}
