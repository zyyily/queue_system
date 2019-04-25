package com.queue.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class Message implements Serializable {
    private Integer id;
    private Integer userId;
    private String userNo;
    private String messageContent;
    private Integer staffId;
    private String staffName;
    private Integer messageType;
    private String messageTypeName;
    private String createTime;
}
