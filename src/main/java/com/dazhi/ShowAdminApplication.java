package com.dazhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dazhi.*.mapper")
public class ShowAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShowAdminApplication.class, args);
	}

}
