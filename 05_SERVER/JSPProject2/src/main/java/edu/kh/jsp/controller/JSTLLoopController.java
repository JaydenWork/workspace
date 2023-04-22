package edu.kh.jsp.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.kh.jsp.model.dto.Book;

@WebServlet("/jstl/loop")
public class JSTLLoopController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<Book> bookList = new ArrayList();
		
		bookList.add(new Book("언어의 무게", "파스칼 메르시어", 19800));
		bookList.add(new Book("노동의 상실", "카밀라 팡", 21300));
		bookList.add(new Book("신의 아들 단군", "박효신", 15300));
		bookList.add(new Book("해리포터", "홍길동", 13500));
						
						 //문자열		//변수명
		req.setAttribute("bookList", bookList);
		
		// loop.jsp로 요청 위임한
		req.getRequestDispatcher("/WEB-INF/views/jstl/loop.jsp").forward(req, resp);
		
		
		
	}
}
