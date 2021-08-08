package com.codingdojo.displayDate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("EEEE 'the' d 'of' MMMM, yyyy");
		
		System.out.println(dateFormat.format(date));
		
		model.addAttribute("date", dateFormat.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("h':'mm aa");
		
		System.out.println(dateFormat.format(date));
		model.addAttribute("time", dateFormat.format(date));
		return "time.jsp";
	}
}
