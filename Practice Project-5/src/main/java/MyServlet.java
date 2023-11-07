import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        response.setContentType("text/html");
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Servlet Result</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Servlet Result</h1>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Age: " + age + "</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
