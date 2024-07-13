package lk.ijse.demosamplelecture;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/health")
public class Demo extends HttpServlet {

    //first lesson - get HttpClient by intelliJ(header bar ---> Tools ----> HTTP Client ----> create request in HTTP Client)
    //execute this doGet method

    /*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("health test!!!");
    }*/

    //second lesson - tomcat Engine method (give @Override method shortcut : ctrl+O/o)

    /*@Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        //And also check whether the incoming method is a GET method or POST method(req.getMethod();)
    }


    //According to the relevant method(GET,POST,DELETE,PUT/PATCH) the necessary business logics are implemented in the doPost() method
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("health test is POST test,,");
    }*/

    //print "hello!!!" in rest-api_1.http client
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("health test!!!");
        PrintWriter writer = response.getWriter();
        writer.println("hello!!!");
    }

}
