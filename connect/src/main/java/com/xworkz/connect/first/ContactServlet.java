package com.xworkz.connect.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("running ContactServer in server");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init in server");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet method");
		String name = req.getParameter("userName");
		String email = req.getParameter("emailId");
		String mobile = req.getParameter("mobile");
		Long convertedMobile = Long.parseLong(mobile);
		String comments = req.getParameter("comments");

		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		// writer.print("user name " + name);
		if (name.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("contact name is " + name);
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
		if (convertedMobile > 1000000) {
			writer.print("<span style='color:green'>");
			writer.print("correct mobileNo " + convertedMobile);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("invalid mobile number");
		}
		writer.print("<br>");
		if (comments.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("comments are valid " + comments);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("invalid comments");
		}
		writer.print("<br>");
		writer.print("<a href=\"index.html\">Home</a>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
