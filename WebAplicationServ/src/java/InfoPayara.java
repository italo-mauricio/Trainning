import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/my")

public class InfoPayara extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(InfoPayara.class.getName());

    @Override
    public void init() throws ServletException {
        super.init();
        LOGGER.log(Level.INFO, "Invocou um servlet no método init");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOGGER.log(Level.INFO, "Requisição invocada no método service");
        super.service(request, response);
    }
}
