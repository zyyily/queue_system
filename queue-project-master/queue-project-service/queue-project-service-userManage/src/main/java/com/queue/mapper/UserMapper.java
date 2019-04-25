package com.queue.mapper;

import com.queue.pojo.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {
    List<Users> selectUserList(Users users);
    void insertUser(Users users);
    void updateUser(Users users);
    void removeUser(Users users);
}
