import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Name", urlPatterns = "/name")
public class NameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("form.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String first_name = request.getParameter("first_name");

        if (first_name == null ) {
            first_name = "World";
        }
        request.setAttribute("first_name", first_name);
        request.getRequestDispatcher("howdy.jsp").forward(request,response);
    }

//    DRILL 1 (Name Page)
//    A user goes to the url "/name" and is given a "name" page. On the "name" page, the user sees a form
//    prompting them to enter their first name. After submitting their name, the user is redirected to a page that says
//    in an h1: "Well, howdy, TheUserNameGoesHere!"
//      - use a POST request on the form
//      - use one servlet and two JSPs.
//      - don't worry about styling.
//      - the request dispatcher will be used for both the doGet and doPost methods of the servlet


}
