import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ip")
public class IpServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Obtém o número do IP do servidor
        String serverIp = request.getLocalAddr();

        // Obtém o número do IP do cliente
        String clientIp = request.getRemoteAddr();

        // Verifica se o IP do servidor é igual ao IP do cliente
        boolean isLocal = serverIp.equals(clientIp);

        // Monta a resposta HTML
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Informações de IP</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Informações de IP</h1>");
        out.println("<p>IP do servidor: " + serverIp + "</p>");
        out.println("<p>IP do cliente: " + clientIp + "</p>");
        out.println("<p>Horário da conexão: " + getCurrentTime() + "</p>");
        out.println("<p>Localização: " + (isLocal ? "CASA" : "ESTRANGEIRO") + "</p>");
        out.println("</body>");
        out.println("</html>");

        // Exibe informações do IP do cliente e hora da conexão na console do GlassFish
        System.out.println("IP do Cliente: " + clientIp + ", Hora da Conexão: " + getCurrentTime());
    }

    private String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }
}
