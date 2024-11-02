package com.xiaoxin.usercenter;

import com.xiaoxin.usercenter.mapper.UserMapper;
import com.xiaoxin.usercenter.model.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class UserCenterApplicationTests {
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        Assert.assertEquals(23, users.size());
        users.forEach(System.out :: println);
    }

}
