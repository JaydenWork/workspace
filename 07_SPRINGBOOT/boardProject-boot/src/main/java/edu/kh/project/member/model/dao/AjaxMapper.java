package edu.kh.project.member.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.kh.project.member.model.dto.Member;

@Mapper
public interface AjaxMapper {
	
	String selectNickname(String email);
	
	public String selecMemberTel(String nickname);
	
	public int checkNickname(String nickname);
	
	public int checkEmail(String email);
	
	public Member selectMember(String email);
	
	public List<Member> selectMemberList(String input);
}
