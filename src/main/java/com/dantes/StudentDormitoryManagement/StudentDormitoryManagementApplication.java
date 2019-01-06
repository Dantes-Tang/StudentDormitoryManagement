package com.dantes.StudentDormitoryManagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.dantes.StudentDormitoryManagement.dao")
public class StudentDormitoryManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDormitoryManagementApplication.class, args);
	}

}

