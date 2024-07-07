package com.gfg.spring_boot_web_intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.WebApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class SpringBootWebIntroApplication {

	@Bean
	HelloWorld helloWorld() {
		return new HelloWorld();
	}
	public static void main(String[] args) {

		WebApplicationContext webApplicationContext = (WebApplicationContext) SpringApplication.run(SpringBootWebIntroApplication.class, args);
		HelloWorld hw = (HelloWorld) webApplicationContext.getBean("helloWorld");
		hw.print();
	}

}
