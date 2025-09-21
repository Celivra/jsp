package com.celivra.javawebendhomework.Model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Post {
    private Long id;
    private String title;
    private String content;
    private String publisher;
    private LocalDateTime dateTime;
    public Post(Long id, String title, String content, String publisher, LocalDateTime dateTime) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publisher = publisher;
        this.dateTime = dateTime;
    }
    public Post(String title, String content, String publisher, LocalDateTime dateTime) {
        this.title = title;
        this.content = content;
        this.publisher = publisher;
        this.dateTime = dateTime;
    }
    public Post() {}
}
