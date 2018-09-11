package com.sln.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerSample {
		@RequestMapping(method=RequestMethod.GET,name="/welcome.htm")
		public String showPage() {
			System.out.println("controller");
		return "welcome";
	}
}
