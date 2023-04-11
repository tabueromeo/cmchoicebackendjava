package com.tchopcoin.cmchoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 


@SpringBootApplication
@RestController 
public class CmchoiceApplication {
	

	@RequestMapping("/") 
	
	public String home(){ 
	
	return "bonjour le monde"; 

	} 

	public static void main(String[] args) {
		SpringApplication.run(CmchoiceApplication.class, args);
	}

}
