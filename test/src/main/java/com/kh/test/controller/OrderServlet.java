package com.kh.test.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/orderProduct.do")
public class OrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        int blackPen = Integer.parseInt(request.getParameter("blackPen"));
        int redPen = Integer.parseInt(request.getParameter("redPen"));
        int bluePen = Integer.parseInt(request.getParameter("bluePen"));
        int white = Integer.parseInt(request.getParameter("white"));

      
        int total = (blackPen * 500) + (redPen * 700) + (bluePen * 700) + (white * 1000);

        if (total != 0) {
            
            request.setAttribute("name", name);
            request.setAttribute("blackPen", blackPen);
            request.setAttribute("redPen", redPen);
            request.setAttribute("bluePen", bluePen);
            request.setAttribute("white", white);
            request.setAttribute("total", total);
            request.getRequestDispatcher("/WEB-INF/views/resultPage.jsp").forward(request, response);
        } else {
            response.sendRedirect("/error.do");
        }
    }
}
