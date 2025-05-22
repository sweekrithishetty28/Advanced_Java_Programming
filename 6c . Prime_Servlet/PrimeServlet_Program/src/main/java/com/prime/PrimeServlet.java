/* 6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure./*
package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/checkPrime")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;

            // Step-by-step check
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Output HTML
            out.println("<html><body>");
            out.println("<h2>Prime Number Checker Result</h2>");
            out.println("<p>Entered Number: " + number + "</p>");

            if (isPrime) {
                out.println("<p style='color:green'>" + number + " is a Prime Number.</p>");
            } else {
                out.println("<p style='color:red'>" + number + " is NOT a Prime Number.</p>");
            }

            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");
        } catch (NumberFormatException e) {
            out.println("<p style='color:red'>Invalid input. Please enter a valid number.</p>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}

