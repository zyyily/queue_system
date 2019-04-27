package com.queue.mapper;

import com.queue.pojo.Message;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface MessageMapper {
    List<Message> getMessageList(Message message) throws Exception;

    Integer addMessage(Message message) throws Exception;

    Integer updateMessage(Message message) throws Exception;

    Integer removeMessage(Message message) throws Exception;
}
