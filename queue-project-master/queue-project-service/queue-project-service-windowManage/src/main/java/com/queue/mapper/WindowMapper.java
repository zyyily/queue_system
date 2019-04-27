package com.queue.mapper;

import com.queue.pojo.Business;
import com.queue.pojo.Window;
import org.apache.ibatis.annotations.Mapper;
import org.aspectj.weaver.patterns.ExactAnnotationFieldTypePattern;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WindowMapper {
    List<Window> selectWindow(Window window) throws Exception;

    Integer insertWindow(Window window) throws Exception;

    Integer updateWindow(Window window) throws Exception;

    Integer deleteWindow(Window window) throws Exception;
}
