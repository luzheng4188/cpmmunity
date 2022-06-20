package com.nomcoder.cpmmunity;

import com.nomcoder.cpmmunity.dao.DiscussPostMapper;
import com.nomcoder.cpmmunity.dao.UserMapper;
import com.nomcoder.cpmmunity.entity.DiscussPost;
import com.nomcoder.cpmmunity.entity.User;
import net.bytebuddy.build.ToStringPlugin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@SpringBootTest

public class MapperTests {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);

        User liubei = userMapper.selectByName("liubei");
        System.out.println(liubei);

    }

    @Test
    public void testInsertUser(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("12346");
        user.setSalt("abc");
        user.setEmail("test@qq.com");
        user.setHeaderUrl("http");
        user.setCreateTime(new Date());

        int i = userMapper.insertUser(user);
        System.out.println(i);
    }

    @Test
    public void testSelectPosts(){
        List<DiscussPost> list = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost discussPost : list) {
            System.out.println(discussPost);
        }
        int i = discussPostMapper.selectDiscussPostRows(0);
        System.out.println(i);
    }
}
