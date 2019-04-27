package com.queue.service;

import com.queue.pojo.Message;
import com.queue.util.ResultBean;

public interface MessageService {
    ResultBean getMessageList(Message messages) throws Exception;

    ResultBean addMessage(Message messages) throws Exception;

    ResultBean updateMessage(Message messages) throws Exception;

    ResultBean removeMessage(Message messages) throws Exception;
}
