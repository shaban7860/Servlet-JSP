package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
       
    public LifeCycleServlet() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() of Servlet");
	}

	public void destroy() {
		System.out.println("destroy() of Servlet");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("service() of Servlet");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>service() of servlet</h1>");
		out.println("<h2>service() of servlet</h2>");
		out.println("<h3>service() of servlet</h3>");
		out.println("<h4>service() of servlet</h4>");
		out.println("<h5>service() of servlet</h5>");
		out.println("<h6>service() of servlet</h6>");
	}

}
