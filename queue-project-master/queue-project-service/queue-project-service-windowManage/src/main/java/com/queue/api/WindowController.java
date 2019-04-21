package com.queue.api;

import com.alibaba.fastjson.TypeReference;

import com.queue.pojo.Window;
import com.queue.service.WindowService;
import com.queue.util.ResultBean;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/windowManage")
public class WindowController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private WindowService windowService;

    @RequestMapping(value = "/getWindows",method = RequestMethod.POST)
    public ResultBean getWindows(@RequestBody String params) throws Exception {
        logger.info("参数："+params);
        Window window = JSON.parseObject(params,new TypeReference<Window>(){});
        ResultBean result = windowService.getWindowList(window);
        return result;
    }
}
