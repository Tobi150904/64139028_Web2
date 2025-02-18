package ntu.edu.nvh;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Aboutme")
public class Aboutme extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Aboutme() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>About Me</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; margin: 40px; background-color: #f5f5f5; }");
        out.println(".container { max-width: 600px; background: white; padding: 20px; border-radius: 10px; box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1); }");
        out.println("h2 { color: #333; }");
        out.println("p { font-size: 16px; color: #555; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>Thông tin cá nhân</h2>");
        out.println("<p><strong>Họ và Tên:</strong> Ngô Việt Hoàng</p>");
        out.println("<p><strong>Ngày sinh:</strong> 15/09/2004</p>");
        out.println("<p><strong>Email:</strong> hoang.nv.64cntt@ntu.edu.vn</p>");
        out.println("<p><strong>Sở thích:</strong>Đọc sách, du lịch</p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
//    }
}
