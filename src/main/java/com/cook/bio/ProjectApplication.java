package com.cook.bio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cook.bio.dao.utils.DBGenerator;

@SpringBootApplication(scanBasePackages = { "com.cook.bio" })
@EnableJpaRepositories(basePackages = "com.cook.bio.dao")
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}
}
