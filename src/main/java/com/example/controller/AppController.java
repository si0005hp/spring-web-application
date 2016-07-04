package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.IService;

@RestController
@RequestMapping("/app")
public class AppController {

//	@Autowired(required = false)
	@Autowired
	private IService service;
	
	@ResponseBody
	@RequestMapping("/")
	public String root() {
		return "Hello World!";
	}
	
}
