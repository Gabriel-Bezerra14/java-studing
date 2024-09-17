package br.com.gabrielbezerra.todolist.task;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TeskController {

    @Autowired
    private ITaskReopository taskRepository;

    @PostMapping("/")
    public void create(@RequestBody TaskModel taskModel, HttpServletResponse request) {
        System.out.println("Chegou no Controller" + request.getAttribute("id"));
        var task = this.taskRepository.save(taskModel);
        return;
    }
}