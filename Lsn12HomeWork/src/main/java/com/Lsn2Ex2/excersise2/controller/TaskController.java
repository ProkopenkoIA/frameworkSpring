package com.Lsn2Ex2.excersise2.controller;

import com.Lsn2Ex2.excersise2.model.Task;
import com.Lsn2Ex2.excersise2.model.TaskStatus;
import com.Lsn2Ex2.excersise2.service.FileGateway;
import com.Lsn2Ex2.excersise2.service.TaskService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/tasks")
@AllArgsConstructor
public class TaskController {

    private final TaskService taskService;
    private final FileGateway fileGateway;

    @PostMapping
    public ResponseEntity<Task> addTask(@RequestBody Task task){
        task.setCreatedDate(LocalDateTime.now());
        fileGateway.writeToFile(task.getTask_name() + ".txt", task.toString());
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }



    @GetMapping("/status/{status}")
    public List<Task> findByStatus(@PathVariable TaskStatus status){
        return taskService.findByStatus(status);
    }


    @PutMapping("/{id}")
    public Task updateTaskStatus(@PathVariable Long id, @RequestBody Task task){
        return taskService.updateTaskStatus(id,task);
    }


    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
