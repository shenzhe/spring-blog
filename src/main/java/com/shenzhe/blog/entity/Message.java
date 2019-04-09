package com.shenzhe.blog.entity;


import lombok.Data;

@Data
public class Message {
    private Integer id;
    private Integer task_id;
    private String sender;
    private String receiver;
    private Integer create_time;
    private Integer type;
    private String title;
    private Integer status;
    private Integer send_time;
}
