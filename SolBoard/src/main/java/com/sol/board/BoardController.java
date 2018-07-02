package com.sol.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@RequestMapping("board.do")
	public String main_board(){
		return "board/board";
	}
}
