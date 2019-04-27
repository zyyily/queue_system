package com.queue.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Queues implements Serializable {
    private Integer id;
    private String queueNo;
    private Integer userId;
    private String userNo;
    private Integer businessId;
    private String businessName;
    private Integer windowId;
    private String windowNo;
    private Integer queueNum;
    private String createTime;
    private Integer waitTime;
    private String handler;
    private Integer transact;
    private String transactName;
}
