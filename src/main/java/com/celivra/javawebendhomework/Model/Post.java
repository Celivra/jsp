package com.celivra.javawebendhomework.Model;

import com.celivra.javawebendhomework.Service.UserService;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
public class Post {
    private Long id;
    private String title;
    private String content;
    private Long publisherId;
    private LocalDateTime dateTime;
    private Integer clickNum;
    public Post(Long id, String title, String content, Long publisherId, LocalDateTime dateTime, Integer clickNum) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publisherId = publisherId;
        this.dateTime = dateTime;
        this.clickNum = clickNum;
    }
    public Post(String title, String content, Long publisherId, LocalDateTime dateTime, Integer clickNum) {
        this.title = title;
        this.content = content;
        this.publisherId = publisherId;
        this.dateTime = dateTime;
        this.clickNum = clickNum;
    }
    public Post() {}
    public String getPublisherName(){
        return UserService.getUserById(this.publisherId).getUsername();
    }
    public String getFormattedDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return dateTime != null ? dateTime.format(formatter) : "";
    }
}
