package com.queue.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.queue.pojo.Users;
import com.queue.service.UserService;
import com.queue.util.MD5Util;
import com.queue.util.ResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/userManage")
public class UserController {
    @Autowired
    private UserService userService;

    private Logger logger= LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ResultBean login(@RequestBody String params) throws Exception{
        logger.info("登录所需要的参数："+params);
        Users users= JSON.parseObject(params,new TypeReference<Users>(){});

        return userService.login(users);
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public ResultBean register(@RequestBody String params)throws Exception{
        logger.info("注册所需要的参数："+params);
        Users users=JSON.parseObject(params,new TypeReference<Users>(){});
        users.setPassword(MD5Util.md5Encode(users.getPassword()));
        return  userService.register(users);
    }
    @RequestMapping(value = "/getUserList",method = RequestMethod.POST)
    public ResultBean getUserList(@RequestBody String params) throws Exception {
        logger.info("查询所需的参数："+params);
        Users users=JSON.parseObject(params,new TypeReference<Users>(){});
        userService.getUserList(users);
        return userService.getUserList(users);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public ResultBean updateUser(@RequestBody String params)throws Exception{
        Users users=JSON.parseObject(params,new TypeReference<Users>(){});
        userService.updateUser(users);
        return  userService.updateUser(users);
    }
}
