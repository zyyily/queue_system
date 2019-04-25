package com.queue.service;

import com.queue.pojo.Message;
import com.queue.util.ResultBean;

import java.util.ResourceBundle;

public interface MessageService {
    ResultBean getMessageList(Message message)throws Exception;
}
