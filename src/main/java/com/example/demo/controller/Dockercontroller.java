package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dockercontroller {

	@GetMapping("/bonjour")
	public Map<String,String> bonjour(){
		
		Map<String,String> bn=new HashMap();
		
		 bn.put("bn","bonjour");
		 
		 return bn;
	}
}
