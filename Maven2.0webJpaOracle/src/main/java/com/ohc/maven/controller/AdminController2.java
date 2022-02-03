package com.ohc.maven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ohc.maven.model.Admin;

@Controller
public class AdminController2
{
	@RequestMapping("index")
	public String start()
	{
		return "index";
	}
	@RequestMapping("api")
	public String api()
	{
		return "api";
	}
	@RequestMapping("home")
	public ModelAndView start(String getfromusername)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("namecontrol", getfromusername);
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("home2")
	public ModelAndView start2(@RequestParam("getfromusername") String name)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("namecontrol", name);
		mv.setViewName("index");
		return mv;
	}
	
	
	@RequestMapping("admin")
	public ModelAndView start(Admin admc)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("admcx", admc);
		mv.setViewName("admin");
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}