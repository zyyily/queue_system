package com.queue.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Message {
    private Integer id;
    private Integer userId;
    private String messageContent;
    private Integer staffId;
    private Integer messageType;
    private Integer queueId;
    private Integer transact;
}
