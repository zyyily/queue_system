package com.queue.pojo;



import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Users implements Serializable {
    private Integer id;
    private String userNo;
    private String password;
    private String email;
    private String phone;
    private String createTime;
    private String newPassword;
    private Integer userType;
    private String userTypeName;
}
