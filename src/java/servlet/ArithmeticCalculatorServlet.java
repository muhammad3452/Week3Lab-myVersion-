/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author muham
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstValue = request.getParameter("firstvalue");
        String secondValue = request.getParameter("secondvalue");
         request.setAttribute("firstvalue", firstValue);
         request.setAttribute("secondvalue", secondValue);
         
     
        
        String addition = request.getParameter("addition");
        String subtraction = request.getParameter("subtraction");
        String multiplication = request.getParameter("multiply");
         request.setAttribute("addition", addition);
         request.setAttribute("subtraction", subtraction);
         request.setAttribute("multiply", multiplication);
        //String remainder = request.getParameter("remainder");
        
        int firstValueParsed = 0;
        int secondValueParsed = 0;
        
        
       /* if (firstValue == null && secondValue == null) {
            request.setAttribute("message", "---");
        }*/
        if(firstValue == null && secondValue == null) {
            request.setAttribute("message", "invalid.");
        }
        else {
            firstValueParsed = Integer.parseInt(firstValue);
            secondValueParsed = Integer.parseInt(secondValue); 
            
        }
        
        
        if (addition != null) {
            
            request.setAttribute("message", (firstValueParsed + secondValueParsed) + "");

        }
        else if (subtraction != null) {
            request.setAttribute("message", (firstValueParsed - secondValueParsed) + "");

        }
        
        else if (multiplication != null) {
            request.setAttribute("message", (firstValueParsed * secondValueParsed) + "");
        }
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);


        
        
    }
    
    

}
