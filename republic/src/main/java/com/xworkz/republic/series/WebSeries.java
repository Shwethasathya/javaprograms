package com.xworkz.republic.series;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/web")
public class WebSeries extends HttpServlet {

	public WebSeries() {
		System.out.println("running default constructor of Webseries");

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running" + getClass().getSimpleName());
		String name = req.getParameter("series name");
		String language = req.getParameter("series language");
		String episodes = req.getParameter("episodes");
		String ott = req.getParameter("ott platform");
		String budget = req.getParameter("total budget");

		System.out.println(name);
		System.out.println(language);
		System.out.println(episodes);
		System.out.println(ott);
		System.out.println(budget);

		PrintWriter writer = resp.getWriter();

		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<pre>");
		writer.print("<span style='color:blue'>");
		writer.print("series name " + name + " is sent successfully");
		writer.print("series language " + language + " is sent successfully");
		writer.print("series episodes " + episodes + " is sent successfully");
		writer.print("series ott " + ott + " is sent successfully");
		writer.print("series budget " + budget + " is sent successfully");
		writer.print("</span>");
		writer.print("</pre>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

	}
}
