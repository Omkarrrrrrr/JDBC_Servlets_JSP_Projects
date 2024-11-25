package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myLogin")

public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		String myEmail = req.getParameter("email1");
		String myPass = req.getParameter("pass1");

		if (myEmail.equals("omi77@gmail.com") && myPass.equals("omkar123")) {
			System.out.println("success");
		} else {
			System.out.println("failed");
		}
	}

}
