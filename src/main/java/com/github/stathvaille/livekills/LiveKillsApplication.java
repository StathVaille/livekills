package com.github.stathvaille.livekills;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LiveKillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiveKillsApplication.class, args);
	}
}
