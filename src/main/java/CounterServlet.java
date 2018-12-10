import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet",urlPatterns = "/counter")
public class CounterServlet extends HttpServlet {

    public static int count = 0; //does not need to be static//

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String reset = request.getParameter("reset");
        if (reset != null) count = 0;
        count++;
        response.getWriter().println("<h1>page viewed " + count + " times.</h1>");
    }
}
