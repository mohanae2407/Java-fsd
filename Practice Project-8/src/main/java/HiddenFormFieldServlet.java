import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HiddenFormFieldServlet")
public class HiddenFormFieldServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the user's name from the form
        String name = request.getParameter("name");

        // Set the user's name in a hidden form field
        request.setAttribute("storedName", name);

        // Forward the request to the index.html page
        request.getRequestDispatcher("/index.html").forward(request, response);
    }
}
