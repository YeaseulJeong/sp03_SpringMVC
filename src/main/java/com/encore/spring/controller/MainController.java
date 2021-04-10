package com.encore.spring.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class MainController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 *  결국 결과 값 받는다
		 *  그걸 바인딩_ 원래는 ServletRequest 에 _ 지금은 ModelAndView 에 바인딩
		 */
		// System.out.println("들어옴");
		Map<String, String> map = new HashMap<String, String>();
		map.put("info", "Spring MVC!!");	
		
		ModelAndView mv = new ModelAndView("main_result.jsp", map);   // request 에 바인딩 되는 것과 동일함
		return mv;
	}

}
