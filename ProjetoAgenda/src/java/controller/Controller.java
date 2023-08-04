/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;

/**
 *
 * @author italo
 */
@WebServlet(name = "Controller", urlPatterns = {"/main"})
public class Controller extends HttpServlet {
    
    private static final long serialVersionUID = 1L;
    DAO dao = new DAO();
    
    public Controller() {
		super();
	}

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        response.getWriter().append("Server funcionando").append(request.getContextPath());
        String action = request.getServletPath();
        System.out.println(action);
    }
    


}
