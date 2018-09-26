import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Hello")
public class Hello extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        res.setCharacterEncoding("UTF-8");

               try (PrintWriter out = res.getWriter()){
               String name = req.getParameter("user");
               String family = req.getParameter("family");
               out.println("hello "+ name+" "+ family);
               out.flush();

           }


    }
}
