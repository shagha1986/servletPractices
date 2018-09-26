import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Login")
public class Login extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String Username = req.getParameter("username");
        String Password = req.getParameter("password");


      if(Password.equals("servlet")){
            RequestDispatcher dispatcher = req.getRequestDispatcher("/resultServlet");
            dispatcher.forward(req,res);

        }
        else {
            out.print("wrong password");
            RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
            dispatcher.include(req,res);
        }
    }


}
