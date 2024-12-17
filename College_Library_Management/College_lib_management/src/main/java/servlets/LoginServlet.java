package servlets;  // Correct package for servlets

import backend.UserDAO;  // Correctly importing UserDAO from the backend package
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieving username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Create an instance of UserDAO (from the backend package)
        UserDAO userDAO = new UserDAO();

        // Validate the login credentials
        if (userDAO.login(username, password)) {
            // If login is successful, redirect to the addBook.jsp page
            response.sendRedirect("addBook.jsp");
        } else {
            // If login fails, show an error message
            response.setContentType("text/html");
            response.getWriter().println("<h3>Invalid Credentials. Please try again!</h3>");
        }
    }
}
