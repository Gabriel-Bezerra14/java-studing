package br.com.gabrielbezerra.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITaskReopository extends JpaRepository<TaskModel, UUID> {
}