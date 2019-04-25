package com.queue.service.impl;

import com.queue.mapper.MessageMapper;
import com.queue.pojo.Message;
import com.queue.service.MessageService;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    @Override
    public ResultBean getMessageList(Message message) throws Exception{
        ResultBean resultBean=new ResultBean();
        List<Message> messages=messageMapper.getMessageList(message);
        resultBean.setMessage("查询成功");
        resultBean.setSuccess(true);
        resultBean.setDataList(messages);
        return resultBean;
    }
}
