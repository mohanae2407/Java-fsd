import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the user's name from the form
        String name = request.getParameter("name");

        // Get the HTTP session associated with the request (or create a new one)
        HttpSession session = request.getSession();

        // Set the user's name in the session
        session.setAttribute("name", name);

        // Redirect to the index.html page
        response.sendRedirect("index.html");
    }
}
