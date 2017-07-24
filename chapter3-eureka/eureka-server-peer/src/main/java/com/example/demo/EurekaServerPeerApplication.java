package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ApplicationContext;


@EnableEurekaServer   //
@SpringBootApplication
public class EurekaServerPeerApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EurekaServerPeerApplication.class, args);
		String[] activeProfiles = ctx.getEnvironment().getActiveProfiles();
		for (String profile : activeProfiles) {
			System.out.println("Spring Boot 使用profile为:"+profile );
		}
	}

}
