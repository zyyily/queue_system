package com.queue.service;

import com.queue.pojo.Users;
import com.queue.util.ResultBean;


public interface UserService {
    ResultBean login(Users users) throws Exception;

    ResultBean register(Users users) throws Exception;

    ResultBean getUserList(Users users) throws Exception;

    ResultBean updateUser(Users users) throws Exception;
}
