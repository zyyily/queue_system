package com.queue.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Setter
@Getter
public class Materials implements Serializable {
    private Integer id;
    private String materialsNo;
    private String materialsName;
    private Integer businessId;
    private String businessName;
    private String createTime;
}
