package com.nomcoder.cpmmunity.dao;

import com.nomcoder.cpmmunity.entity.User;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String Username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id,int status);

    int updateHeader(int id,String headerUrl);

    int updatePassword(int id,String password);
}
