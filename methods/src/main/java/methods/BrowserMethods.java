package methods;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 9, urlPatterns = "/call")
public class BrowserMethods extends HttpServlet {

	public BrowserMethods() {
		System.out.println("running default constructor from browserMethods...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("calling init method...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get from browseMethod");
		String data = "displaying data as get";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post from browserMethod");
		String data = "displaying data as post";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("put from browseMethod");
		String data = "displaying data as put";
		PrintWriter writer = resp.getWriter();
		writer.print(data);

	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("options from browser");
		String data = "displaying data as options";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete from browser");
		String data = "displaying data as delete";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("trace from browser");
		String data = "displaying data as trace";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("head from browser");
		String data = "displaying data as head";
		PrintWriter writer = resp.getWriter();
		writer.print(data);

	}
}
