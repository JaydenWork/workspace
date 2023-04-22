package edu.kh.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//Servlet 등록 + 주소 연동
@WebServlet("/test/result")
public class TestController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 파라미터 사용x, 값 세팅 x
		// -> 바로 JSP로 위임 코드 작성
		
		
		//webapp 폴더를 기준으로 위임할 JSP 경로 작성
		RequestDispatcher dispatcher
		= req.getRequestDispatcher("/WEBx-INF/views/testResult.jsp");
		
		dispatcher.forward(req, resp);
	}
}
