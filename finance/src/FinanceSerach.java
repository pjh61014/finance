

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
@WebServlet(name = "financeSearch", urlPatterns = { "/financeSearch.do" })
public class FinanceSerach extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String classify = request.getParameter("classify");
		String type = request.getParameter("");
		String profit = request.getParameter("profit");
		String scale = request.getParameter("scale");
		String Yield = request.getParameter("Yield");
		String charge = request.getParameter("charge");
		String std = request.getParameter("std");
		
		System.out.println("지금들어오긴했냐");
		System.out.println("classify : "+classify);
		System.out.println("type : "+type);
		System.out.println("profit : "+profit);
		System.out.println("scale : "+scale);
		System.out.println("Yield : "+Yield);
		System.out.println("charge : "+charge);
		System.out.println("std : "+std);
		
		
	}

}
