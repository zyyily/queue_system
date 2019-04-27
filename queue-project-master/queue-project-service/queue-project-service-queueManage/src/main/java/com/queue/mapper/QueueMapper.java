package com.queue.mapper;

import com.queue.pojo.Queues;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface QueueMapper {
    List<Queues> getQueueList(Queues queues)throws Exception;

    void addQueue(Queues queues) throws Exception;

    void missTurnHandle(Queues queues) throws Exception;
}

