package com.xworkz.republic.series;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/wish")
public class ZooServelet extends HttpServlet {

	public ZooServelet() {
		System.out.println("running default zooServelet");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running" + getClass().getSimpleName());
		String zooName = req.getParameter("zooName");
		String location = req.getParameter("zooLocation");
		String builtBy = req.getParameter("builtBy");
		String year = req.getParameter("builtYear");
		String noOfAnimals = req.getParameter("totalAnimals");
		String noOfTigers = req.getParameter("tigers");
		String noOfGiraffe = req.getParameter("giraffe");
		String noOfElephants = req.getParameter("elephants");
		String noOfCheetha = req.getParameter("cheetha");
		String noOfLions = req.getParameter("lions");
		String noOfZebra = req.getParameter("zebras");
		String noOFGorilla = req.getParameter("gorillas");
		String totalArea = req.getParameter("area");
		String entryFee = req.getParameter("fee");
		String noOfWorkers = req.getParameter("workers");
		String noOfGates = req.getParameter("gates");
		String vehicalsAllowed = req.getParameter("allowed");
		String openTimimgs = req.getParameter("opened");
		String closeTimings = req.getParameter("closed");
		String timeRequired = req.getParameter("requiredTime");

		System.out.println(zooName);
		System.out.println(location);
		System.out.println(builtBy);
		System.out.println(year);
		System.out.println(noOfAnimals);
		System.out.println(noOfTigers);
		System.out.println(noOfGiraffe);
		System.out.println(noOfElephants);
		System.out.println(noOfCheetha);
		System.out.println(noOfLions);
		System.out.println(noOfZebra);
		System.out.println(noOFGorilla);
		System.out.println(totalArea);
		System.out.println(entryFee);
		System.out.println(noOfWorkers);
		System.out.println(noOfGates);
		System.out.println(vehicalsAllowed);
		System.out.println(openTimimgs);
		System.out.println(closeTimings);
		System.out.println(timeRequired);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<pre>");
		writer.print("zoo name " + zooName + " is sent successfully");
		writer.print("location " + location + " is sent successfully");
		writer.print("built by " + builtBy + " is sent successfully");
		writer.print("built year " + year + " is sent successfully");
		writer.print("total animals " + noOfAnimals + " is sent successfully");
		writer.print("tigers " + noOfTigers + " is sent successfully");
		writer.print("giraffe " + noOfGiraffe + " is sent successfully");
		writer.print("elephants " + noOfElephants + " is sent successfully");
		writer.print("cheetha " + noOfCheetha + " is sent successfully");
		writer.print("lions " + noOfLions + " is sent successfully");
		writer.print("zebras " + noOfZebra + " is sent successfully");
		writer.print("gorillas " + noOFGorilla + " is sent successfully");
		writer.print("area " + totalArea + " is sent successfully");
		writer.print("entry fee " + entryFee + " is sent successfully");
		writer.print("total workers " + noOfWorkers + " is sent successfully");
		writer.print("gates " + noOfGates + " is sent successfully");
		writer.print("vehicals " + vehicalsAllowed + " is sent successfully");
		writer.print("open " + openTimimgs + " is sent successfully");
		writer.print("close " + closeTimings + " is sent successfully");
		writer.print("required time " + timeRequired + " is sent successfully");
		
		writer.print("</pre>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

	}

}
