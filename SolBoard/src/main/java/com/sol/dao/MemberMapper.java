package com.sol.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface MemberMapper {
	
	
	@Select("SELECT * FROM member_temp WHERE email=#{email}")
	public MemberVO LoginCheck(String email);
	
	
}
