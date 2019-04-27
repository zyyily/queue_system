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
            resultBean.setDataList(newUsers);
            resultBean.setMessage("登陆成功");
            resultBean.setSuccess(true);
        }
        resultBean.setDataList(newUsers);
        return resultBean;
    }

    @Override
    public ResultBean register(Users users) throws Exception {
        ResultBean resultBean=new ResultBean();
        if (!checkRepeat(users).isSuccess()){
            resultBean.setSuccess(false);
            resultBean.setMessage("注册失败,用户名已存在!");
            return resultBean;
        }
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
        Users qryUser=new Users();
        qryUser.setUserNo(users.getUserNo());
        //修改密码
        if (users.getPassword()!=null&&!users.getPassword().equals("")) {
            String oldPassword=userMapper.selectUserList(qryUser).get(0).getPassword();
            if (oldPassword.equals(MD5Util.md5Encode(users.getPassword()))) {
                users.setPassword(MD5Util.md5Encode(users.getNewPassword()));
                userMapper.updateUser(users);
            } else{
                resultBean.setMessage("原密码错误");
                resultBean.setSuccess(false);
                return resultBean;
            }
        }
        userMapper.updateUser(users);
        resultBean.setMessage("更新成功");
        resultBean.setSuccess(true);
        return resultBean;
    }

    @Override
    public ResultBean removeUser(Users users) throws Exception {
        ResultBean resultBean=new ResultBean();
        userMapper.removeUser(users);
        resultBean.setMessage("注销成功");
        resultBean.setSuccess(true);
        return resultBean;
    }

    //检测用户名是否存在
    @Override
    public ResultBean checkRepeat(Users users) throws Exception {
        ResultBean resultBean=new ResultBean();
        Users qryUsers=new Users();
        qryUsers.setUserNo(users.getUserNo());
        List<Users> users1=userMapper.selectUserList(qryUsers);
        if (users1.size()>0&&users1.get(0).getId()!=users.getId()){
            resultBean.setSuccess(false);
            resultBean.setMessage("用户名已被占用！");
        }else {
            resultBean.setSuccess(true);
        }
        return resultBean;
    }
}
