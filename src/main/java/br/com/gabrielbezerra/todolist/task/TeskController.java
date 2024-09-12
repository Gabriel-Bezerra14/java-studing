package br.com.gabrielbezerra.todolist.task;

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
    public void create(@RequestBody TaskModel taskModel) {
        System.out.println("Chegou no Controller");
        var task = this.taskRepository.save(taskModel);
        return;
    }
}