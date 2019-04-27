package com.queue.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.queue.pojo.Queues;
import com.queue.service.QueueManageService;
import com.queue.service.feignService.UserFeign;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/queueManage")
public class QueueController {
    @Autowired
    private QueueManageService queueManageService;
//    @Autowired
//    private UserFeign userFeign;

    @RequestMapping(value = "/getQueueList",method = RequestMethod.POST)
    public ResultBean getQueueList(@RequestBody String params)throws Exception{
        Queues queues= JSON.parseObject(params,new TypeReference<Queues>(){});
        return queueManageService.getQueueList(queues);
    }
    @RequestMapping(value = "/addQueue",method = RequestMethod.POST)
    public ResultBean addQueue(@RequestBody String params)throws Exception{
        Queues queues=JSON.parseObject(params,new TypeReference<Queues>(){});
        return queueManageService.addQueue(queues);
    }
    @RequestMapping(value = "/missTurnHandle",method = RequestMethod.POST)
    public ResultBean missTurnHandle(@RequestBody String params)throws Exception{
        Queues  queues=JSON.parseObject(params,new TypeReference<Queues>(){});
        return null;
    }
}
