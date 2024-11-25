package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login1 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    String myemail = req.getParameter("email1");
	    String myPass = req.getParameter("pass1");
	    
	    PrintWriter out = res.getWriter();

	    // Ensure that myemail and myPass are not null before calling equals
	    if (myemail != null && myPass != null && myemail.equals("omi77@gmail.com") && myPass.equals("omkar123")) {
	        // If the email and password match, forward to profile.jsp
//	    	req.setAttribute("name_key", "Omi");
	    	
	    	HttpSession session = req.getSession();
	    	session.setAttribute("name_key","Omi");
	        RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
	        rd.forward(req, res);
	    } else {
	    	
	    	
	    	res.setContentType("text/html");
	    	out.print(" <h3>Email id and pas didnt matched</h3>");
	        // If the email or password don't match, forward to index.html
	        RequestDispatcher rd = req.getRequestDispatcher("/index.html");
	        rd.include(req, res);
	    }
	}
}