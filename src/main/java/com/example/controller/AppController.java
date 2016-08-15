package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.AppService;

@Controller
@RequestMapping("/app")
public class AppController {

	@Autowired
	private AppService service;
	
	@ResponseBody
	@RequestMapping("/")
	public String root() {
		return "Hello World!";
	}
	
	@RequestMapping("/view")
	public String view() {
		return "home";
	}
	
}
