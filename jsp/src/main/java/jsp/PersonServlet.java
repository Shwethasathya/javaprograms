package jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "message")
public class PersonServlet extends HttpServlet {

	public PersonServlet() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init in server");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doPost in server");

		String fname = req.getParameter("firstName");
		String lname = req.getParameter("lastName");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");

		System.out.println(fname);
		System.out.println(lname);
		System.out.println(gender);
		System.out.println(reason);
		System.out.println(address);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Display.jsp");
		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);
		requestDispatcher.forward(req, resp);

	}

}
