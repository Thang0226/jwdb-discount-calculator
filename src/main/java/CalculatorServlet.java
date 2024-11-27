import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet", value = "/display-discount")
public class CalculatorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String description = req.getParameter("description");
		String price_str = req.getParameter("price");
		float price = Float.parseFloat(price_str);
		String percent_str = req.getParameter("percent");
		int percent = Integer.parseInt(percent_str);

		float discount_amount = (float) (price * percent * 0.01);
		float discount_price = price - discount_amount;

		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("Product Description: " + description);
		writer.println("<br>");
		writer.println("Product Price: " + price);
		writer.println("<br>");
		writer.println("Discount Percentage: " + percent);
		writer.println("<br>");
		writer.println("Discount Amount: " + discount_amount);
		writer.println("<br>");
		writer.println("Discount Price: " + discount_price);
		writer.println("</html>");
	}
}
