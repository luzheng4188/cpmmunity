package com.nomcoder.cpmmunity.Service;

import com.nomcoder.cpmmunity.dao.UserMapper;
import com.nomcoder.cpmmunity.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
