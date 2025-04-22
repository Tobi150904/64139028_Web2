package thiGk.ntu64139028.controller;

import thiGk.ntu64139028.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    private List<Student> students = new ArrayList<>();

    public StudentController() {
        // Hard-code danh sách student
        students.add(new Student(1, "Nguyễn Văn A", "GROUP1"));
        students.add(new Student(2, "Trần Thị B", "GROUP2"));
        students.add(new Student(3, "Lê Văn C", "GROUP1"));
    }

    @GetMapping("/all")
    public String listStudents(Model model) {
        model.addAttribute("students", students);
        return "student/list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "student/add";
    }

    @PostMapping("/new")
    public String addStudent(@ModelAttribute Student student) {
        student.setId(students.size() + 1);
        students.add(student);
        return "redirect:/student/all";
    }

    @GetMapping("/view/{id}")
    public String viewStudent(@PathVariable int id, Model model) {
        Student student = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("student", student);
        return "student/view";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        students.removeIf(s -> s.getId() == id);
        return "redirect:/student/all";
    }
}