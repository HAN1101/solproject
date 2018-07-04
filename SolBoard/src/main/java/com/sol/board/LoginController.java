package com.sol.board;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sol.dao.MemberDAO;
import com.sol.dao.MemberVO;

@Controller
public class LoginController {
	
	@Autowired
	private MemberDAO dao;
	
	@RequestMapping("login.do")
	public String login_main(){
		
		return "main";
	}
	@RequestMapping("login_ok.do")
	public String login_ok(HttpSession session, Model model, HttpServletRequest request, HttpServletResponse response){
		response.setContentType("text/html; charset=UTF-8");
		
		
		
		String email = request.getParameter("email").toLowerCase();
		String pwd   = request.getParameter("pwd");
		
		MemberVO vo = dao.LoginCheck(email);
		String db_email = vo.getEmail().toLowerCase();
		String db_pwd = vo.getPwd();
		
		if(db_email.equals(email)){
			if(db_pwd.equals(pwd)){
				
				session.setAttribute("email", email);
				return "main";
			}else{
				
			}
			return "main";
			
		}
		
		return "main";
	}
}
