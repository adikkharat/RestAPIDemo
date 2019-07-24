package com.app.RestApp;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	HashMap<String,String> hm= new HashMap<String,String>();
	
	@GetMapping("/welcome")
	@ResponseBody
	public String sayWelcome()
	{
		return "<h1>Welcome To MyApp</h1>";
	}

	@GetMapping("/")
	//@ResponseBody
	public String sayLogin()
	{
		return "login";
	}
	
	@PostMapping("/loginvalidate")
	public String loginValidate(@RequestParam("uname") String name,@RequestParam("pwd") String password)
	{
		if(name.equals(hm.get(password)) && password.equals(hm.get(name)))
			return "success";
		else
			return "error";
	}
	
	@GetMapping("/register")
	public String newRegister()
	{
		return "register";
	}
	
	@PostMapping("/loginregister")
	public String loginRegister(@RequestParam("uname") String name,@RequestParam("pwd") String password)
	{
		hm.put(name, password);
		
	return "login";
	}
	

}
