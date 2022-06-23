package com.example.fanout;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class FanoutApplication {

	public static void main(String[] args) {
		SpringApplication.run(FanoutApplication.class, args);
	}

}
