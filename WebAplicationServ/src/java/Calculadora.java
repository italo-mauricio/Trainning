import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/calc")
public class Calculadora extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String oper = request.getParameter("oper");
        int elem1 = Integer.parseInt(request.getParameter("elem1"));
        int elem2 = Integer.parseInt(request.getParameter("elem2"));

        int result = 0;
        if (oper.equals("soma")) {
            result = elem1 + elem2;
        } else if (oper.equals("subtracao")) {
            result = elem1 - elem2;
        }

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Resultado</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Resultado: " + result + "</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
