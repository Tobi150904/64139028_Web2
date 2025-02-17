package vn.edu.nvh;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BMI extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BMI() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>BMI Calculator</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #1e1e1e; color: #fff; text-align: center; }");
        out.println(".container { width: 300px; margin: 100px auto; padding: 20px; background: #2c2c2c; "
                + "box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5); border-radius: 10px; }");
        out.println("h2 { color: #ffb300; }");
        out.println("input[type='text'], input[type='submit'] { width: 100%; padding: 10px; margin: 10px 0; "
                + "border: 1px solid #444; border-radius: 5px; }");
        out.println("input[type='text'] { background: #444; color: #fff; }");
        out.println("input[type='submit'] { background: #ff5f0f; color: #fff; border: none; cursor: pointer; font-weight: bold; }");
        out.println("input[type='submit']:hover { background: #e65200; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h2>BMI</h2>");
        out.println("<form method='POST' action='/BMI__Servlet/BMI'>");
        out.println("<label>Chiều cao (cm):</label>");
        out.println("<input type='text' name='height' placeholder='Nhập chiều cao'>");
        out.println("<label>Cân nặng (kg):</label>");
        out.println("<input type='text' name='weight' placeholder='Nhập cân nặng'>");
        out.println("<input type='submit' value='Tính BMI'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        double height = Double.parseDouble(request.getParameter("height")) / 100.0;
        double weight = Double.parseDouble(request.getParameter("weight"));
        double bmi = weight / (height * height);

        String category;
        String color;

        if (bmi < 18.5) {
            category = "Gầy";
            color = "#3fa7d6";
        } else if (bmi < 24.9) {
            category = "Bình thường";
            color = "#2ecc71";
        } else if (bmi < 29.9) {
            category = "Thừa cân";
            color = "#f1c40f";
        } else {
            category = "Béo phì";
            color = "#e74c3c";
        }

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kết quả BMI</title>");
        out.println("<style>");
        out.println("body { font-family: Arial, sans-serif; background-color: #1e1e1e; color: #fff; text-align: center; }");
        out.println(".result-container { width: 350px; margin: 100px auto; padding: 20px; background: #2c2c2c; "
                + "box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.5); border-radius: 10px; }");
        out.println("h3 { color: " + color + "; }");
        out.println("p { font-size: 18px; color: #fff; }");
        out.println(".back-btn { display: inline-block; margin-top: 15px; padding: 10px 20px; background: #3498db; "
                + "color: #fff; text-decoration: none; border-radius: 5px; font-weight: bold; }");
        out.println(".back-btn:hover { background: #2980b9; }");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='result-container'>");
        out.printf("<h3>Kết quả: BMI = %.2f</h3>", bmi);
        out.printf("<p style='font-weight: bold;'>Phân loại: <span style='color:%s;'>%s</span></p>", color, category);
        out.println("<a class='back-btn' href='/BMI__Servlet'>Tính lại</a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}