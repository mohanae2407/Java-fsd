import java.io.IOException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/MyServlet")
public class MyServlet implements Servlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>Servlet Result</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Servlet Result</h1>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Age: " + age + "</p>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }

    @Override
    public String getServletInfo() {
        return "MyServlet";
    }

    @Override
    public void destroy() {
        // Cleanup code, if any
    }
}
