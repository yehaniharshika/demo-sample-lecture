package lk.ijse.demosamplelecture;

import com.sun.jdi.Value;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//exact mapping
//@WebServlet(value = "/student")

//extension mapping
//@WebServlet(value = "*.php")

//empty string mapping
//@WebServlet(value = "")

//wild card  mapping
@WebServlet(value = "/*")

//default servlet mapping
//@WebServlet(value = "/")
public class Student extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HTTP method: "+ req.getMethod());
        System.out.println("Context Path: "+ req.getContextPath());
        System.out.println("Servlet Path: "+ req.getServletPath());
        System.out.println("Path Info: "+ req.getPathInfo());
        System.out.println("Path Translated: "+ req.getPathTranslated());
        System.out.println("Query String: "+ req.getQueryString());
        System.out.println("Request URI: "+ req.getRequestURI());
        System.out.println("Request URL: "+ req.getRequestURL());

        //get query string value
        System.out.println(req.getParameter("name"));
    }
}
