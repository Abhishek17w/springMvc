package com.abhishek.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.abhishek.springmvc.model.Alien;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j,ModelMap m) {
		
		//HttpServletRequest req used in the parameter
		//int i = Integer.parseInt(req.getParameter("num1"));
		//int j = Integer.parseInt(req.getParameter("num2"));
		
		int num3 = i + j;
		//HttpSession session = req.getSession();
		//session.setAttribute("num3" , num3);
		
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("result");
		//mv.addObject("num3", num3);
		
		m.addAttribute("num3", num3);

		return "result";
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a) {
		
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setName(aname);
		
		//ModelAndView mv = new ModelAndView();
		//mv.setViewName("result");
		//mv.addObject("num3", num3);
		
		//m.addAttribute("alien", a);

		return "result";
	}
}
