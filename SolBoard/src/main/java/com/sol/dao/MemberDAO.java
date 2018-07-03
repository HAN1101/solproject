package com.sol.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class MemberDAO {
	
	@Autowired
	private MemberMapper mapper;
	
	public MemberVO LoginCheck(String email) {
		return mapper.LoginCheck(email);
	}
	
}
