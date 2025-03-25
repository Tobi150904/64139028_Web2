package nvh.controllers;

import nvh.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class SinhVien_controller {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Trang chủ");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Giới thiệu");
        return "about";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Student> students = Arrays.asList(
            new Student("SV001", "Nguyễn Văn A", "Hà Nội"),
            new Student("SV002", "Trần Thị B", "Hồ Chí Minh"),
            new Student("SV003", "Lê Văn C", "Đà Nẵng")
        );
        model.addAttribute("title", "Danh sách sinh viên");
        model.addAttribute("students", students);
        return "list";
    }

    @GetMapping("/address")
    public String address(Model model) {
        model.addAttribute("title", "Địa chỉ");
        return "address";
    }

    @GetMapping("/sinhvien-hashcode")
    public String sinhVienHashCode(Model model) {
        Student student1 = new Student("SV001", "Nguyễn Văn A", "Hà Nội");
        Student student2 = new Student("SV001", "Nguyễn Văn A", "Hà Nội");
        
        model.addAttribute("title", "Sinh viên HashCode");
        model.addAttribute("student1", student1);
        model.addAttribute("student2", student2);
        model.addAttribute("hash1", student1.hashCode());
        model.addAttribute("hash2", student2.hashCode());
        return "sinhvien-hashcode";
    }
}