package com.queue.service;

import com.queue.pojo.Window;
import com.queue.util.ResultBean;
import org.springframework.stereotype.Service;



@Service
public interface WindowService {
    ResultBean getWindowList(Window window) throws Exception;
    ResultBean modifyWindow(Window window);
}
