package com.alb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trapi")
public class MyTrController {

	@RequestMapping("getref")
	public String getRef(){
		return "ref is a02032";
	}
}
