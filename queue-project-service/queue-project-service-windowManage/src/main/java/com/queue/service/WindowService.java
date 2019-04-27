package com.queue.service;

import com.queue.pojo.Business;
import com.queue.pojo.Window;
import com.queue.util.ResultBean;
import org.springframework.stereotype.Service;


@Service
public interface WindowService {
    ResultBean getWindowList(Window window) throws Exception;

    ResultBean addWindow(Window window) throws Exception;

    ResultBean modifyWindow(Window window) throws Exception;

    ResultBean deleteWindow(Window window) throws Exception;

}
