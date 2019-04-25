package com.queue.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.queue.pojo.Message;
import com.queue.service.MessageService;
import com.queue.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private Logger logger= LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/getMessageList",method = RequestMethod.POST)
    public ResultBean getMessageList(@RequestBody String params) throws Exception {
        logger.info("查询留言所需要的参数："+params);
        Message message= JSON.parseObject(params,new TypeReference<Message>(){});
        return messageService.getMessageList(message);
    }

}
