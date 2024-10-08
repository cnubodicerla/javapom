package com.srk.dao;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/devops")
public class web extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");

        // Get the writer to write the response content
        PrintWriter out = response.getWriter();

        // Write the HTML content for the DevOps webpage
        out.println("<html>");
        out.println("<head><title>DevOps Page</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome to DevOps World!</h1>");
        out.println("<p>This is a simple Java-powered webpage for showcasing DevOps concepts.</p>");
        out.println("<ul>");
        out.println("<li>Continuous Integration (CI)</li>");
        out.println("<li>Continuous Delivery (CD)</li>");
        out.println("<li>Infrastructure as Code (IaC)</li>");
        out.println("<li>Monitoring and Logging</li>");
        out.println("</ul>");
        out.println("<p>DevOps brings Development and Operations together!</p>");
        out.println("</body>");
        out.println("</html>");

        // Close the writer
        out.close();
    }
}

