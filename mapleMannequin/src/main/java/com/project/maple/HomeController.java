package com.project.maple;

import java.util.LinkedList;
import java.util.List;

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
		List<String> mannequinList = new LinkedList<String>();
		
		Mannequin mannequin = new Mannequin();
		mannequin.getAllItemSet().put("Hat", 1002140);
		mannequin.getAllItemSet().put("FaceA", 1012083);
		mannequinList.add(mannequin.getMannequin());
		
		Mannequin mannequin2 = new Mannequin();
		mannequin2.setDefaultSkin(2016);
		mannequinList.add(mannequin2.getMannequin());
		
		model.addAttribute("mList", mannequinList);
		
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
