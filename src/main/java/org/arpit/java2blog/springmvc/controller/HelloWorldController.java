
package org.arpit.java2blog.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public ModelAndView hello() {
		String helloWorldMessage = "Hello new world from java2blog1";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}
}
