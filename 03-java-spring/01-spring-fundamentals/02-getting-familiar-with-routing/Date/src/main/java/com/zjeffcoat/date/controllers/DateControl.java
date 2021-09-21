package com.zjeffcoat.date.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;
import java.text.SimpleDateFormat;

@Controller
public class DateControl {
	
@RequestMapping("/")
	public String index() {
		return "Date.jsp";
	}

@RequestMapping("/date")
	public String date(Model model){
		String datePattern = "EEEE, dd/MM/yyyy"
				+"";
		SimpleDateFormat dateFormat= new SimpleDateFormat(datePattern);
		String date1=dateFormat.format(new Date());
		model.addAttribute("date", date1);
		return "Day.jsp";
	}

@RequestMapping("/time")
	public String time(Model model) {
		String timePattern = "HH:mm aa"
			+"";
		SimpleDateFormat timeFormat= new SimpleDateFormat(timePattern);
		String time1=timeFormat.format(new Date());
		model.addAttribute("time", time1);
		return "Time.jsp";
}
}

