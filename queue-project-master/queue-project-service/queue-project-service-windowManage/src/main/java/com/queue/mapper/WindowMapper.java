package com.queue.mapper;

import com.queue.pojo.Window;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WindowMapper {
    List<Window> selectAllWindow(Window window) throws Exception;
}
