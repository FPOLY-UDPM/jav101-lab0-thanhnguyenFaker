import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// Đường dẫn này dùng để gọi Servlet trên trình duyệt
@WebServlet("/poly/hello.php")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Hỗ trợ tiếng Việt nếu bạn có gõ dấu
        resp.setContentType("text/html;charset=UTF-8");

        // Xuất nội dung ra trình duyệt
        resp.getWriter().println("<h1>FPT Polytechnic</h1>");
    }
}
