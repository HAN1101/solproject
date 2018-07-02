package com.sol.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	@RequestMapping("notice.do")
	public String notice(){
		return "notice/notice";
	}
}
