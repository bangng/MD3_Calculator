package rikkei.academy.calculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/calculate")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float firstOperand = Float.parseFloat(req.getParameter("first-operand"));
        float secondOperand = Float.parseFloat(req.getParameter("second-operand"));
        char operator =req.getParameter("operator").charAt(0);
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result</h1>");
        try {
            float result = Calculator.calculator(firstOperand,secondOperand,operator);
            writer.println(firstOperand+ "" +operator + ""+secondOperand + "=" +result);

        }catch (Exception ex){
            writer.println("Error: "+ ex.getMessage());
        }
        writer.println("</html>");

    }

    public void destroy() {
    }
}