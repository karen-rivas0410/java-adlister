import javax.servlet.ServletException;
import javax.jws.WebService;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("colorForm.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fav_color = request.getParameter("fav_color");

        if (fav_color != null) {
            request.setAttribute("fav_color", fav_color);
            request.getRequestDispatcher("bgColor.jsp").forward(request, response);
        }
    }
}



//DRILL 2 (Color Page)
//        A user goes to a url "/pickcolor". On the "pickcolor" page, the user is prompted to enter their favorite color. Upon clicking submit, they are redirected to a page with a background color of their favorite color.
//        - use a POST request on the form
//        - use one servlet and two JSPs
//        - use style tags
//        - the request dispatcher will be used for both the doGet and doPost methods of the servlet

