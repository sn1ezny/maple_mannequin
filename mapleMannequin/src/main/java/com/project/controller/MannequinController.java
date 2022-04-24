package com.project.controller;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.handling.img.ApiHandler;
import com.project.data.AccountDTO;
import com.project.data.MannequinDTO;
import com.project.service.MannequinService;

@Controller
public class MannequinController {
	
	@Inject
	private MannequinService mannequinService;
	private ApiHandler api = new ApiHandler();
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "redirect:/main";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Model model) {
		MannequinDTO mDTO = mannequinService.getMannequin(1);
		model.addAttribute("src", api.getMannequinImgSrc(mDTO));
		
		return "main";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "account/login";
	}
	
	@RequestMapping(value = "/loginTry", method = RequestMethod.POST)
	public String loginCheck(AccountDTO accountDTO, HttpSession session) {
		
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
	
	@RequestMapping(value = "/signUpTry", method = RequestMethod.POST)
	public String signUpTry(AccountDTO accountDTO) {
		return "redirect:/main";
		
	}
	
	@RequestMapping(value = "/myMannequin", method = RequestMethod.GET)
	public String myMannequin(Model model, HttpSession session) {
		Object o_id = session.getAttribute("id");
		if (o_id != null) {
			int session_id = (int) o_id;
			List<MannequinDTO> mList = mannequinService.getMannequinList(session_id);
			List<StringBuilder> mString = new LinkedList<StringBuilder>();
			for (MannequinDTO mDTO : mList) {
				mString.add(api.getMannequinImgSrc(mDTO));
			}
			
			model.addAttribute("mString", mString);
		}
		return "account/myMannequin";
	}
	
	@RequestMapping(value = "/simulator", method = RequestMethod.GET)
	public String simulator(Model model, HttpSession session) {
		return "simulator/simulator";
	}
	
	
}
