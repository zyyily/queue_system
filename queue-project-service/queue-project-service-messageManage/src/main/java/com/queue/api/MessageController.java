package com.queue.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.queue.pojo.Message;
import com.queue.service.MessageService;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageManage")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "/getMessages", method = RequestMethod.POST)
    public ResultBean getMessages(@RequestBody String params) throws Exception {
        Message message = JSON.parseObject(params, new TypeReference<Message>() {
        });
        return messageService.getMessageList(message);
    }

    @RequestMapping(value = "/addMessage", method = RequestMethod.POST)
    public ResultBean addMessage(@RequestBody String params) throws Exception {
        Message message = JSON.parseObject(params, new TypeReference<Message>() {
        });

        return messageService.addMessage(message);
    }

    @RequestMapping(value = "/updateMessage", method = RequestMethod.POST)
    public ResultBean updateMessage(@RequestBody String params) throws Exception {
        Message message = JSON.parseObject(params, new TypeReference<Message>() {
        });

        return messageService.updateMessage(message);
    }

    @RequestMapping(value = "/removeMessage", method = RequestMethod.POST)
    public ResultBean removeMessage(@RequestBody String params) throws Exception {
        Message message = JSON.parseObject(params, new TypeReference<Message>() {
        });

        return messageService.removeMessage(message);
    }
}
