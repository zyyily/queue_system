package com.queue.service.impl;

import com.queue.pojo.Users;
import com.queue.mapper.UserMapper;
import com.queue.service.UserService;
import com.queue.util.MD5Util;
import com.queue.util.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResultBean login(Users users) throws Exception {
        ResultBean resultBean=new ResultBean();
        users.setPassword(MD5Util.md5Encode(users.getPassword()));
        List<Users> newUsers=userMapper.selectUserList(users);
        if (newUsers.size()==0){
            resultBean.setMessage("用户名或密码错误！");
            resultBean.setSuccess(false);
        }else{
            resultBean.setMessage("登陆成功");
            resultBean.setSuccess(true);
        }
        resultBean.setDataList(newUsers);
        return resultBean;
    }

    @Override
    public ResultBean register(Users users) throws Exception {
        ResultBean resultBean=new ResultBean();
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        users.setCreateTime(sdf.format(date));
        userMapper.insertUser(users);
        resultBean.setSuccess(true);
        resultBean.setMessage("注册成功!");
        return resultBean;
    }

    @Override
    public ResultBean getUserList(Users users) throws Exception {
        ResultBean resultBean=new ResultBean();
        List<Users> list=userMapper.selectUserList(users);
        resultBean.setMessage("查找成功");
        resultBean.setSuccess(true);
        resultBean.setDataList(list);
        return resultBean;
    }

    @Override
    public ResultBean updateUser(Users users) throws Exception {
        ResultBean resultBean=new ResultBean();
        users.setPassword(MD5Util.md5Encode(users.getPassword()));
        userMapper.updateUser(users);
        resultBean.setMessage("更新成功");
        resultBean.setSuccess(true);
        return resultBean;
    }
}
