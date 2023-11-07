import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookieServlet")
public class SetCookieServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the user's name from the form
        String name = request.getParameter("name");

        // Create a cookie to store the name
        Cookie nameCookie = new Cookie("name", name);

        // Set the cookie's maximum age (in seconds)
        nameCookie.setMaxAge(3600); // 1 hour

        // Add the cookie to the response
        response.addCookie(nameCookie);

        // Redirect back to the index.html page
        response.sendRedirect("index.html");
    }
}
