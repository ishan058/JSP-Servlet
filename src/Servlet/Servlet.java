package Servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/hello")
public class Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res){
        req.getRequestDispatcher("index.jsp");
    }

}
