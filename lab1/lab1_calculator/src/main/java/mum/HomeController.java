package mum;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.setAttribute("Welcome","Welcome to calculator Page");
        RequestDispatcher dispatcher = req.getRequestDispatcher("calculator.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String add1 = request.getParameter("add1").trim() ;
        String add2 = request.getParameter("add2").trim();
        String mult1 = request.getParameter("mult1").trim();
        String mult2 = request.getParameter("mult2").trim();

        String sum = "";
        String product = "";

        // Check for valid inputs....
        try {
            Integer a1 = Integer.parseInt(add1);
            Integer a2 = Integer.parseInt(add2);
            sum = "" + (a1+a2);
        } catch(NumberFormatException e) {
            if (add1.isEmpty()) add1 = "''";
            if (add2.isEmpty()) add2 = "''";
            sum = "''";
        }

        /*
         * Integer.parseInt(str) throws NumberFormatException
         * if the string cannot be converted to an integer.
         */

        try {
            Integer m1 = Integer.parseInt(mult1);
            Integer m2 = Integer.parseInt(mult2);
            product = "" + (m1 * m2);
        } catch(NumberFormatException e) {
            if (mult1.isEmpty()) mult1 = "''";
            if (mult2.isEmpty()) mult2 = "''";
            product = "''";
        }
        request.setAttribute("sum",sum);
        request.setAttribute("product",product);

        RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);

    }

}
