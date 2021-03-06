package com.main.cron;

import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@ExposesResourceFor(HelloWorld.class)
@RequestMapping("hello")
public class HelloWorld {

	@RequestMapping(value="/world" , method=RequestMethod.GET)
	public ModelMap reviewsHelpful(	
			 @RequestParam(name = "name", required = true) String name
			) {	
		ModelMap model=new ModelMap();
		
		model.addAttribute("HelloWorld"+name);
	return model;
	}
	
}