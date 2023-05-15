package ch8;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FilterListenerServlet
 */
@WebServlet("/FilterListenerServlet")
public class FilterListenerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FilterListenerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");
		
		PrintWriter out = response.getWriter();
		out.println("<form method='post' action='FilterListenerServlet'>");
		out.println("name : <input type='text' name='id'/>");
		out.println("<input type='submit'/>");
		out.println("</form>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=EUC-KR");
		
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		session.setAttribute("id", new String(id));
	
		String message = id+ " 로 로그인 되었습니다";
		
		PrintWriter out = response.getWriter();
		out.println(message);
	}

}
