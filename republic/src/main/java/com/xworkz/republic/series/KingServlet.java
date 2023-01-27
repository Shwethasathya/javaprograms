package com.xworkz.republic.series;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/king")
public class KingServlet extends HttpServlet {

	public KingServlet() {
		System.out.println("running default method of KingServlet");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init method...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet in KingServlet");
		String name = req.getParameter("kingName");
		String region = req.getParameter("region");
		String noOfQueens = req.getParameter("queens");
		String DOB = req.getParameter("birth date");
		String DOD = req.getParameter("death date");

		System.out.println(name);
		System.out.println(region);
		System.out.println(noOfQueens);
		System.out.println(DOB);
		System.out.println(DOD);

		PrintWriter writer = resp.getWriter();
		writer.print("html");
		writer.print("body");
		writer.print("html");
		writer.print("kingName " + name);
		writer.print("region " + region);
		writer.print("noOfQueens " + noOfQueens);
		writer.print("birth date " + DOB);
		writer.print("death date " + DOD);
		writer.print("/body");
		writer.print("/html");
		resp.setContentType("text/html");

	}

}
