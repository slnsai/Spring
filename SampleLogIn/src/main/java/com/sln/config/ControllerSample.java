package com.sln.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerSample {
		@RequestMapping(name="/welcome.htm",method=RequestMethod.GET)
		public String showPage() {
			System.out.println("controller");
		return "welcome";
	}
}
