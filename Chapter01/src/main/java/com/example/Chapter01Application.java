package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.example","board.controller"})
@SpringBootApplication
public class Chapter01Application {

	public static void main(String[] args) {
		//SpringApplication.run(Chapter01Application.class, args);
		SpringApplication springApplication = new SpringApplication(Chapter01Application.class);
		springApplication.setWebApplicationType(WebApplicationType.NONE);
		springApplication.run(args);
	}
}
/*
WebApplicationType 으로 설정할 수 있는 3가지 타입

1) WebApplicationType.NONE – 웹으로 동작하지 않도록 설정
2) WebApplicationType.SERVLET – 기존의 스프링 MVC를 기반으로 웹 애플리케이션을 구동하는 설정
3) WebApplicationType.REACTIVE – 스프링 5.0에서 추가된 비동기 처리와 논블로킹 입출력을 지원하는
                                  웹플럭스(WebFlux)를 적용할 때 사용
                                  
application.properties
-자바 소스보다 application.properties 설정의 우선순위가 높다.
 
 */
