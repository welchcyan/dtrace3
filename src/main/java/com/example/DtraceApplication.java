package com.example;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class DtraceApplication {

	private static final Logger LOG = Logger.getLogger(DtraceApplication.class.getName());

	@Autowired
	private RestTemplate restTemplate;

	public static void main(String[] args) {
		SpringApplication.run(DtraceApplication.class, args);
	}

	@RequestMapping("/")
	public String home() {
		LOG.log(Level.INFO, "you called service4");
		return "final call";
	}


}
