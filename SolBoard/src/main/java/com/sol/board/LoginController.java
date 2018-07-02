package com.sol.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("login.do")
	public String login_main(){
		
		return "login/login";
	}
	
}
