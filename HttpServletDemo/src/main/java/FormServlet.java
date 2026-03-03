import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/form")


public class FormServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>Welcome to CFS</h2>");
        out.println("<p>you can contact us at 8789297123</p>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String course=req.getParameter("course");

        resp.setContentType("text/html");
        PrintWriter out= resp.getWriter();
        out.println("Student Details:</h2>");
        out.println("<p>Student Name:"+name+"</p>");
        out.println("<p>Student Course:"+course+"</p>");


    }
}
