package com.project.maple;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.function.Mannequin;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:/main";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model) {
		Mannequin func = new Mannequin();
		func.getAllItemSet().put("Hat", 1002140);
		func.getAllItemSet().put("FaceA", 1012083);
		String manne = func.getMannequin();
		model.addAttribute("manne",manne);
		
		return "main";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "user/login";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		return "user/signUp";
	}
	
}
