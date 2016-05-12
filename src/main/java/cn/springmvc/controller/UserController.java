package cn.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 	Lian
 * @date	2016年1月12日 下午9:58:57
 * @desc	用户控制层
 */
@Controller
@RequestMapping("/")
public class UserController {

	@RequestMapping("index")
	public String index() {
		return "index";
	}
}
