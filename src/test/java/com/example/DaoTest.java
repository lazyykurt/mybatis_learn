package com.example;

import java.util.List;

import com.example.dao.UserDao;
import com.example.pojo.User;
import com.example.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;


/**
 * Unit test for simple App.
 */
public class DaoTest
{

    @org.junit.Test
    public void testUserDao() {
        // 获取 SqlSession 对象
        SqlSession sqlSession = MyBatisUtils.getSession();

        // 执行 SQL 语句
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUser();

        for (User user : userList) {
            System.out.println(user);
        }

        // 关闭 SqlSession
        sqlSession.close();
    }
}
