package finance.controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FinanceSerach
 */
@WebServlet(name = "financeSearchs", urlPatterns = { "/financeSearchs.do" })
public class FinanceSearch extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		String classify = request.getParameter("classify");
		String type = request.getParameter("type");
		String profit = request.getParameter("date");
		String scale = request.getParameter("scale");
		String Yield = request.getParameter("profit");
		String charge = request.getParameter("charge");
		String std = request.getParameter("std");
		//response.setContentType("html/);
		
		System.out.println("지금들어오긴했냐");
		System.out.println("classify : "+classify);
		System.out.println("type : "+type);
		System.out.println("date : "+profit);
		System.out.println("scale : "+scale);
		System.out.println("profit : "+Yield);
		System.out.println("charge : "+charge);
		System.out.println("std : "+std);
		
		
	}

}
