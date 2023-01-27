package com.xworkz.connect.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
	public LocationServlet() {
		System.out.println("running LocationServlet in server");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init in server");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("userName");
		String email = req.getParameter("emailId");
		String gender = req.getParameter("gender");
		String starting = req.getParameter("startPoint");
		String destination = req.getParameter("destination");

		System.out.println(name);
		System.out.println(email);
		System.out.println(starting);
		System.out.println(destination);

		PrintWriter writer = resp.getWriter();
		writer.print("<html");
		writer.print("<body>");
		writer.print("<h1>");
		if (name.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("contact name is " + name + "is sent successfully");
		} else {
			writer.print("<span style='color:red'>");
			writer.print("invalid name");
		}
		writer.print("<br>");
		
		if (email.length() > 15) {
			writer.print("<span style='color:green'>");
			writer.print("email is is " + email);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("invalid email");
		}
		
		writer.print("<br>");
		if (starting.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("starting point is " + starting);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("invalid starting");
		}
		writer.print("<br>");
		if (destination.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("destination point is " + destination);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("invalid destination");
		}
		
		writer.print("<a href=\"index.html\">Home</a>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html");
		resp.setContentType("text/html");
	}
}