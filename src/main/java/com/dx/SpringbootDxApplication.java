package com.dx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.dx.dao")
@SpringBootApplication
public class SpringbootDxApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootDxApplication.class, args);
	}
}
