package com.renewimport;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class GirlControllerView {

	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
}