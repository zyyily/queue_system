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
    public ResultBean getMessageList(Message message) throws Exception {
        ResultBean resultBean = new ResultBean();
        List<Message> messageList = messageMapper.getMessageList(message);
        resultBean.setDataList(messageList);
        resultBean.setSuccess(true);
        resultBean.setMessage("查询成功");
        return resultBean;
    }

    @Override
    public ResultBean addMessage(Message message) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setData(messageMapper.addMessage(message));
        resultBean.setSuccess(true);
        resultBean.setMessage("添加成功");
        return resultBean;
    }

    @Override
    public ResultBean updateMessage(Message message) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setData(messageMapper.updateMessage(message));
        resultBean.setSuccess(true);
        resultBean.setMessage("修改成功");
        return resultBean;
    }

    @Override
    public ResultBean removeMessage(Message message) throws Exception {
        ResultBean resultBean = new ResultBean();
        resultBean.setData(messageMapper.removeMessage(message));
        resultBean.setSuccess(true);
        resultBean.setMessage("删除成功");
        return resultBean;
    }
}
