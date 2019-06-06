package com.novawind.estate.application;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.novawind.estate"})
@MapperScan(basePackages = {"com.novawind.estate.mysql.dao"})
public class EstateApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstateApplication.class, args);
	}

}
