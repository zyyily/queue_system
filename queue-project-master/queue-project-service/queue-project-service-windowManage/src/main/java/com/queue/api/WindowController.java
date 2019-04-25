package com.queue.api;

import com.alibaba.fastjson.TypeReference;

import com.queue.pojo.Business;
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

    @RequestMapping(value = "/getWindows", method = RequestMethod.POST)
    public ResultBean getWindows(@RequestBody String params) {
        logger.info("获取窗口接收的参数：" + params);

        Window window = JSON.parseObject(params, new TypeReference<Window>() {
        });
        try {
            return windowService.getWindowList(window);
        } catch (Exception e) {
            logger.error("getWindow is error:" + e);
            return new ResultBean(false, "服务器错误");
        }
    }

    @RequestMapping(value = "/addWindow", method = RequestMethod.POST)
    public ResultBean addWindow(@RequestBody String params) {
        logger.info("添加窗口接收的参数：" + params);

        Window window = JSON.parseObject(params, new TypeReference<Window>() {
        });
        try {
            return windowService.addWindow(window);
        } catch (Exception e) {
            logger.error("addWindow is error:" + e);
            return new ResultBean(false, "服务器错误");
        }
    }

    @RequestMapping(value = "/modifyWindow", method = RequestMethod.POST)
    public ResultBean modifyWindow(@RequestBody String params) {
        logger.info("修改窗口接收的参数：" + params);

        Window window = JSON.parseObject(params, new TypeReference<Window>() {
        });
        try {
            return windowService.modifyWindow(window);
        } catch (Exception e) {
            logger.error("modifyWindow is error:" + e);
            return new ResultBean(false, "服务器错误");
        }
    }

    @RequestMapping(value = "/deleteWindow", method = RequestMethod.POST)
    public ResultBean deleteWindow(@RequestBody String params) {
        logger.info("修改窗口接收的参数：" + params);

        Window window = JSON.parseObject(params, new TypeReference<Window>() {
        });
        try {
            return windowService.deleteWindow(window);
        } catch (Exception e) {
            logger.error("deleteWindow is error:" + e);
            return new ResultBean(false, "服务器错误");
        }
    }

    @RequestMapping(value = "/getBusinesses", method = RequestMethod.POST)
    public ResultBean getBusinesses(@RequestBody String params) {
        logger.info("获取业务接收的参数：" + params);

        Business business = JSON.parseObject(params, new TypeReference<Business>() {
        });
        try {
            return windowService.getBusinessList(business);
        } catch (Exception e) {
            logger.error("getBusinesses is error:" + e);
            return new ResultBean(false, "服务器错误");
        }
    }
}
