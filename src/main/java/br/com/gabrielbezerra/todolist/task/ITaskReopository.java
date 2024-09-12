package br.com.gabrielbezerra.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.scheduling.config.Task;
import java.util.UUID;

public interface ITaskReopository extends JpaRepository<TaskModel, UUID> {
}