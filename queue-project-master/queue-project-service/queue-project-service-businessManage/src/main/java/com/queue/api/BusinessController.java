package com.queue.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.queue.pojo.Business;
import com.queue.service.BusinessService;
import com.queue.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/businessManage")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/getBusinesses", method = RequestMethod.POST)
    public ResultBean getBusinesses(@RequestBody String params) {
        logger.info("获取业务接收的参数：" + params);

        Business business = JSON.parseObject(params, new TypeReference<Business>() {});
        try {
            return businessService.getBusinessList(business);
        } catch (Exception e) {
            logger.error("getBusinesses is error:" + e);
            return new ResultBean(false, "服务器错误");
        }
    }

    @RequestMapping(value = "/modifyBusiness", method = RequestMethod.POST)
    public ResultBean modifyBusiness(@RequestBody String params) throws Exception {
        logger.info("修改业务的参数：" + params);
        Business business = JSON.parseObject(params, new TypeReference<Business>() {
        });
        return businessService.modifyBusiness(business);
    }

    @RequestMapping(value = "/addBusiness", method = RequestMethod.POST)
    public ResultBean addBusiness(@RequestBody String params) throws Exception {
        logger.info("添加业务的参数：" + params);
        Business business = JSON.parseObject(params, new TypeReference<Business>() {
        });

        return businessService.addBusiness(business);
    }

    @RequestMapping(value = "/deleteBusiness", method = RequestMethod.POST)
    public ResultBean deleteBusiness(@RequestBody String params) throws Exception {
        Business business= JSON.parseObject(params, new TypeReference<Business>() {
        });

        return businessService.deleteBusiness(business);
    }
}
