package edu.kh.jsp.student.model.service;
import static edu.kh.jsp.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.jsp.student.model.dao.StudentDAO;
import edu.kh.jsp.student.model.dto.Student;


public class StudentService {
	
	private StudentDAO dao = new StudentDAO();
	
	
	public List<Student> selectAll() throws Exception{
		
		//1. Connection 생
		Connection conn = getConnection();
		
		//2.DAO 호출
		List<Student> stdList = dao.selectAll(conn);
		
		//3.select는 트랜잭션 제어 처리 필요 없음
		
		
		//4.Connection 반환
		close(conn);
		
		
		return stdList;
		
		
		//try(Connection conn = getConnection()){return dao.selectAll(conn);}
		
	}



	

}
