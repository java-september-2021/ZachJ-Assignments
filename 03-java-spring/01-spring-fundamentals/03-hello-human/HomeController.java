package hellohuman.control;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
	@RequestMapping("/")
	public String outdex() {
		return "Hello Human";
	}
	
	@RequestMapping("/{part1}/{name}")
	public String index(@PathVariable("part1") String discard, @PathVariable("name") String name){
		return "Hello" + name;
	}

}


