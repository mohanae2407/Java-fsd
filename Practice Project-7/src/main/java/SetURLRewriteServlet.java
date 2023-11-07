import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetURLRewriteServlet")
public class SetURLRewriteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the user's name from the form
        String name = request.getParameter("name");

        // Create a URL with the "name" parameter
        String url = "index.html?name=" + name;

        // Redirect to the new URL with the "name" parameter
        response.sendRedirect(url);
    }
}
