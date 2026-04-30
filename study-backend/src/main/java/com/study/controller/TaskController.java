package com.study.controller;

import com.study.model.Task;
import com.study.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@CrossOrigin(origins = "*")
public class TaskController {
    
    @Autowired
    private TaskRepository taskRepository;
    
    // 获取某天的任务
    @GetMapping
    public List<Task> getTasks(@RequestParam String date) {
        return taskRepository.findByDate(date);
    }
    
    // 获取所有任务（给热力图）
    @GetMapping("/all")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }
    
    // 添加任务
    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
    
    // 切换完成状态
    @PutMapping("/{id}/toggle")
    public Task toggleTask(@PathVariable Long id) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setDone(!task.getDone());
        return taskRepository.save(task);
    }
    
    // 删除任务
    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }
}