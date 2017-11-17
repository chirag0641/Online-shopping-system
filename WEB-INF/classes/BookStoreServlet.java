 

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * An HTTP Servlet that overrides the service method to return a
 * simple web page.
 */
public class BookStoreServlet extends HttpServlet { 

    public void service (HttpServletRequest request,
                         HttpServletResponse response)
        throws ServletException, IOException
    {
        // Get the dispatcher; it gets the main page to the user
        RequestDispatcher dispatcher =
            getServletContext().getRequestDispatcher(
                "/bookstore.html");

        if (dispatcher == null) {
System.out.println("There was no dispatcher");
            // No dispatcher means the html file could not be found.
            response.sendError(response.SC_NO_CONTENT);
        } else {
System.out.println("There is a dispatcher");
            // Get or start a new session for this user
            HttpSession session = request.getSession();
            // Send the user the bookstore's opening page
            dispatcher.forward(request, response);
        }
    }

    public String getServletInfo() {
        return "The BookStore servlet returns the main web page " +
               "for Duke's Bookstore.";
    }
}

