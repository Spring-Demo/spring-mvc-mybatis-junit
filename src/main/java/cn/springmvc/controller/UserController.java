package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User Controller
 * 
 * @author 	Lian
 * @date	2016年5月12日
 * @since	1.0
 */
@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}
}
