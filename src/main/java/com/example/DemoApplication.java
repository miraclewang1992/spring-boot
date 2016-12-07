package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
	@Resource
	private  ITestService service;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@RequestMapping("/hello1")
	public String greeting() {
		// 加入一个属性，用来在模板中读取
		List<User> user=this.service.selctBySize(10);

		return user.size()+"";
	}
}
