package com.queue.service.feignService;

import com.queue.util.ResultBean;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("queue-project-service-userManage")
@RequestMapping("/userManage")
public interface UserFeign {
    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    ResultBean getUserList(@RequestBody String params) throws Exception;
}
