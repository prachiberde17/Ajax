package com.kgate.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.kgate.entity.Student;

@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView view() {
		Student student = new Student();
		ModelAndView view = new ModelAndView("home");
		view.addObject("student", student);
		return view;
	}

	@PostMapping("/save")
	public @ResponseBody Map<String, Object> getAll(@RequestBody Student student) {
		Map<String, Object> map = new HashMap<>();
		String fname = student.getFirstName();
		String lname = student.getLastName();
//		if (list != null) {
//			map.put("status", "200");
//			map.put("message", "Data found");
//			map.put("data", list);
//		} else {
//			map.put("status", "404");
//			map.put("message", "Data not found");
//
//		}
		System.out.println("check;;;;;;;;" + fname + ": " + lname);
		map.put("msg", "done");
		map.put("data", student);
		return map;
	}
}
