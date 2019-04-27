package com.queue.service;

import com.queue.pojo.Queues;
import com.queue.util.ResultBean;

public interface QueueManageService {
    ResultBean getQueueList(Queues queues) throws Exception;
    ResultBean addQueue(Queues queues) throws Exception;
    ResultBean missTurnHandle(Queues queues) throws Exception;
}
