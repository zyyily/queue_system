package com.queue.pojo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Window {
    private Integer id;
    private String windowNo;
    private Integer businessId;
    private String businessNo;
    private String businessName;
    private Integer status;
    private String statusName;
    private Integer businessNum;
    private Integer businessNowNum;
    private Integer windowStatus;
    private String windowStatusName;
    private String staffNo;
    private String staffName;
    private Integer waitNum;
}
