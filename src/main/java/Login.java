import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CounterServlet", urlPatterns = "/login")
public class Login extends HttpServlet {
    protected void getPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("isAdmin", true);
//    request.setAttribute("isAdmin", false);

        request.setAttribute("isPassword", true);
        String redirectURL = "/login.jsp";
        response.sendRedirect(redirectURL);
    }
}
