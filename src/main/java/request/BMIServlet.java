package request;

import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.Enumeration;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BMIServlet
 */

@WebServlet("/BMIServlet")
public class BMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@SuppressWarnings("rawtypes")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html, charset=UTF-8");
		// RequestDispatcher dispatcher = request.getRequestDispatcher("resultBMI.jsp");
		// dispatcher.forward(request, response);

		PrintWriter out = response.getWriter();
		try {
			float weight = Float.parseFloat(request.getParameter("weight"));
			float height = Float.parseFloat(request.getParameter("height"));
			out.println("<h2>Weight: " + weight + "</h2>\n");
			out.println("<h2>Height: " + height + "</h2>\n");
			out.println("<h2>BMI: " + weight / (height * height) + "</h2>");
		} finally {
			out.close();
		}

	}
}
