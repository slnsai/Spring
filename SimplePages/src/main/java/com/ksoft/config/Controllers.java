package com.ksoft.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controllers {
	@RequestMapping(value="/welcome.htm",method=RequestMethod.GET)
	public String showController() {
		/*ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("welcome");*/
		return "welcome";
	}
}
