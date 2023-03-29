package edu.kh.jdbc.member.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;
import java.util.Random;

import edu.kh.jdbc.member.model.dao.MemberDAO;
import edu.kh.jdbc.member.model.dto.Member;

public class MemberService {
	
	private MemberDAO dao = new MemberDAO();

	/** 회원 목록 조회 서비스
	 * @return memberList
	 * @throws Exception
	 */
	public List<Member> selectMemberList() throws Exception{
		
		Connection conn = getConnection();
		
		List<Member> memberList = dao.selectMemberList(conn);
		
		close(conn);
		
		return memberList;
	}

	public int updateMember(String memberName, 
			String memberGender, int memberNo) throws Exception{
		
		Connection conn = getConnection();
		
		int result = dao.updateMember(conn, memberName, memberGender, memberNo);
		
		// 트랜잭션 처리
		if(result > 0) commit(conn);
		else		   rollback(conn);
		
		close(conn);
		
		return result;
	}
	
	public int updatePassword(String newMemberPw, String memberPw, int memberNo) throws Exception{
		
		Connection conn = getConnection();
		
		int result = dao.updatePassword(conn, newMemberPw, memberPw, memberNo);
		
		if(result > 0) commit(conn);
		else		   rollback(conn);
		
		close(conn);
		
		return result;
	}
	
	
	/**숫자 6자리 보안코드 생성 서비스
	 * @return code
	 * */
	
	public String createSecurityCode() {
		
		StringBuffer code = new StringBuffer();
		// String : 불변성
		// StringBuffer : 가변성
		
		Random ran = new Random(); // 난수 생성 객체
		
		for(int i=0; i<6; i++) {
			int x = ran.nextInt(10); // 0이상 10 미만 정수;	
			code.append(x); // StringBuffer 마지막에 추가(뒤에 이어 붙임)
		}
		
		return code.toString();
		
	}

	public int unRegisterMember(String memberPw, int memberNo) throws Exception{
		// TODO Auto-generated method stub
		
		Connection conn = getConnection();
		
		int result = dao.unRegisterMember(conn, memberPw, memberNo);
		
		if(result > 0) commit(conn);
		else	       rollback(conn);
		
		close(conn);
		
		return result;
	}
	
}