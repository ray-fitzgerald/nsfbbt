package com.bbt.hackathon.nsfweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@EnableWebSocket
@SpringBootApplication
public class NsfWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NsfWebApplication.class, args);
	}
}
