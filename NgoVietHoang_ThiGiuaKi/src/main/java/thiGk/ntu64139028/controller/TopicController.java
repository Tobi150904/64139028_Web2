package thiGk.ntu64139028.controller;

import thiGk.ntu64139028.model.Topic;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/topic")
public class TopicController {
    private List<Topic> topics = new ArrayList<>();

    public TopicController() {
        // Hard-code danh sách topic
        topics.add(new Topic(1, "Web Development", "Build web applications", 101, "Technology"));
        topics.add(new Topic(2, "Data Science", "Analyze data", 102, "Science"));
        topics.add(new Topic(3, "AI", "Artificial Intelligence", 103, "Technology"));
    }

    @GetMapping("/all")
    public String listTopics(Model model) {
        model.addAttribute("topics", topics);
        return "topic/list";
    }

    @GetMapping("/new")
    public String showAddForm(Model model) {
        model.addAttribute("topic", new Topic());
        return "topic/add";
    }

    @PostMapping("/new")
    public String addTopic(@ModelAttribute Topic topic) {
        topic.setId(topics.size() + 1);
        topics.add(topic);
        return "redirect:/topic/all";
    }

    @GetMapping("/view/{id}")
    public String viewTopic(@PathVariable int id, Model model) {
        Topic topic = topics.stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
        model.addAttribute("topic", topic);
        return "topic/view";
    }

    @GetMapping("/delete/{id}")
    public String deleteTopic(@PathVariable int id) {
        topics.removeIf(t -> t.getId() == id);
        return "redirect:/topic/all";
    }
}
