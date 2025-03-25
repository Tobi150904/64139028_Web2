package nvh.controllers;

import nvh.models.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SinhVien_controller {
    private List<SinhVien> danhSachSV = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Trang Chủ");
        model.addAttribute("contentPage", "home-content.html");
        return "layout";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Giới Thiệu");
        model.addAttribute("contentPage", "about-content.html");
        return "layout";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("title", "Danh Sách Sinh Viên");
        model.addAttribute("contentPage", "list-content.html");
        model.addAttribute("danhSachSV", danhSachSV);
        return "layout";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("title", "Thêm Sinh Viên");
        model.addAttribute("contentPage", "add-content.html");
        model.addAttribute("sinhVien", new SinhVien());
        return "layout";
    }

    @PostMapping("/add")
    public String addSinhVien(@ModelAttribute SinhVien sinhVien) {
        danhSachSV.add(sinhVien);
        return "redirect:/list";
    }
}