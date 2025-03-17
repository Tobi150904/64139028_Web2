package nvh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import nvh.models.SinhVien;

import java.util.ArrayList;
import java.util.List;

@Controller
public class info_controller {

    @GetMapping("/info")
    public String info(Model model) {
        List<SinhVien> studentList = new ArrayList<>();
        studentList.add(new SinhVien("64139028", "Ngô Việt Hoàng", 2004, "Nam"));
        studentList.add(new SinhVien("64139029", "Nguyễn Thị Mai", 2003, "Nữ"));
        studentList.add(new SinhVien("64139030", "Phạm Minh Tuấn", 2004, "Nam"));
        studentList.add(new SinhVien("64139031", "Trần Thị Lan", 2003, "Nữ"));
        
        model.addAttribute("studentList", studentList);
        return "info"; 
    }
}
