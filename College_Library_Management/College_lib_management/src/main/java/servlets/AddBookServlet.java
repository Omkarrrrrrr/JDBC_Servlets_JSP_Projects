package servlets;  // Correct package for servlets

import backend.BookDAO;  // Correctly importing BookDAO from the backend package
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieving book details from the form
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        int year = Integer.parseInt(request.getParameter("year"));

        // Create an instance of BookDAO (from the backend package)
        BookDAO bookDAO = new BookDAO();

        // Add the book to the database
        int status = bookDAO.addBook(title, author, year);

        // Check if the book was added successfully
        if (status > 0) {
            // If successful, redirect to the viewBooks.jsp page
            response.sendRedirect("viewBooks.jsp");
        } else {
            // If the addition failed, show an error message
            response.setContentType("text/html");
            response.getWriter().println("<h3>Failed to Add Book. Please try again!</h3>");
        }
    }
}
