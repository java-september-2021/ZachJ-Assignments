package com.zjeffcoat.survey.controllers;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class SurveyControl {
@RequestMapping("/")
	public String landing() {
	return "Landing.jsp";
	}

@PostMapping("/process")
	public String process(HttpSession session, @RequestParam(value="name") String username, @RequestParam(value="dojo") String location, @RequestParam(value="lang") String language, @RequestParam(value="comments") String comment) {
	session.setAttribute("name",username);	
	session.setAttribute("dojo", location);
	session.setAttribute("lang", language);
	session.setAttribute("comments", comment);	
	return "redirect:/result";
	}

@RequestMapping("/result")
	public String result(Model model, HttpSession session) {
		String name=session.getAttribute("name").toString();
		String dojo=session.getAttribute("dojo").toString();
		String lang=session.getAttribute("lang").toString();
		String comments=session.getAttribute("comments").toString();
		model.addAttribute("name", name);
		model.addAttribute("dojo", dojo);
		model.addAttribute("lang", lang);
		model.addAttribute("comments", comments);
		
		return "Result.jsp";
	}
}