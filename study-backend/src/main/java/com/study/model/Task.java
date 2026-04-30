package com.study.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String text;
    private String date;
    private Boolean done;
    
    // 无参构造函数（JPA需要）
    public Task() {}
    
    // 构造函数
    public Task(String text, String date, Boolean done) {
        this.text = text;
        this.date = date;
        this.done = done;
    }
    
    // Getter 和 Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
    
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    
    public Boolean getDone() { return done; }
    public void setDone(Boolean done) { this.done = done; }
}