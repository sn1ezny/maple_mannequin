package com.project.maple;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.project.data.AccountDTO;
import com.project.data.MannequinDTO;
import com.project.function.Mannequin;
import com.project.service.MannequinService;

@Controller
public class MannequinController {
	
	@Inject
	private MannequinService mannequinService; 
	
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
		return "account/login";
	}
	
	@RequestMapping(value = "/loginTry", method = RequestMethod.POST)
	public String loginCheck(AccountDTO accountDTO, HttpSession session) {
		System.out.println(accountDTO.getAccount());
		System.out.println(accountDTO.getPassword());
		
		AccountDTO accountInfo = mannequinService.loginAccount(accountDTO);
		if (accountInfo != null) {
			session.setAttribute("id", accountInfo.getId());
			session.setAttribute("name", accountInfo.getName());
			return "redirect:/main";
		} else {
			return "redirect:/login";
		}
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/main";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		return "account/signUp";
	}
	
	@RequestMapping(value = "/myMannequin", method = RequestMethod.GET)
	public String myMannequin(Model model) {
		MannequinDTO mannequinDTO = mannequinService.getMannequin(1);
		
		Mannequin mannequin = new Mannequin();
		mannequin.setDefaultSkin(mannequinDTO.getSkin());
		LinkedHashMap<String, Integer> mannequinItemSet = mannequin.getAllItemSet();
		mannequinItemSet.put("Hair", mannequinDTO.getHair());
		mannequinItemSet.put("Face", mannequinDTO.getFace());
		mannequinItemSet.put("Overall", mannequinDTO.getOverall());
		mannequinItemSet.put("Hat", mannequinDTO.getHat());
		mannequinItemSet.put("Cape", mannequinDTO.getCape());
		mannequinItemSet.put("Cash", mannequinDTO.getCash());
		mannequinItemSet.put("Glove", mannequinDTO.getGlove());
		mannequinItemSet.put("Shoes", mannequinDTO.getShoes());
		mannequinItemSet.put("Earring", mannequinDTO.getEarring());
		mannequinItemSet.put("FaceA", mannequinDTO.getFacea());
		mannequinItemSet.put("EyeA", mannequinDTO.getEyea());
		mannequinItemSet.put("Top", mannequinDTO.getTop());
		mannequinItemSet.put("Bottom", mannequinDTO.getBottom());
		
		model.addAttribute("manne1", mannequin.getMannequin());
		
		return "account/myMannequin";
	}
	
}
