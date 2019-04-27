package com.queue.pojo;

import lombok.Getter;
import lombok.Setter;
import org.omg.CORBA.INTERNAL;

import java.io.Serializable;
@Setter
@Getter
public class Staff implements Serializable {
    private Integer id;
    private String staffNo;
    private String staffName;
    private Integer businessId;
    private String businessName;
    private Integer windowId;
    private String windowNo;
    private String createTime;
}
