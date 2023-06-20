package edu.kh.project.member.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.kh.project.member.model.dto.Member;

@Repository // DB 연결 의미 + bean 등록 (IOC)
public class AjaxDAO {

   @Autowired // bean 중에서 타입이 같은 객체를 DI
   private AjaxMapper mapper;

   public String selectNickname(String email) {
      return mapper.selectNickname(email);
   }

public String selecMemberTel(String nickname) {
	// TODO Auto-generated method stub
	return mapper.selecMemberTel(nickname);
}


// 이메일 중복 검
public int checkEmail(String email) {
	return mapper.checkEmail(email);
}

public int checkNickname(String nickname) {
	// TODO Auto-generated method stub
	return mapper.checkNickname(nickname);
	}

public Member selectMember(String email) {
	
	return mapper.selectMember(email);
}

public List<Member> selectMemberList(String input) {
	return mapper.selectMemberList(input); // input 전
}
}
   