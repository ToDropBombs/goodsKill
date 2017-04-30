package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by heng on 2017/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
@Transactional
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void countByExample() throws Exception {
    }

    @Test
    public void deleteByExample() throws Exception {
    }

    @Test
    public void deleteByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() throws Exception {
    }

    @Test
    public void insertSelective() throws Exception {
    }

    @Test
    public void selectByExample() throws Exception {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUpdateTimeIsNull();
        userMapper.selectByExample(userExample);
    }

    @Test
    public void selectByPrimaryKey() throws Exception {
    }

    @Test
    public void updateByExampleSelective() throws Exception {
    }

    @Test
    public void updateByExample() throws Exception {
    }

    @Test
    public void updateByPrimaryKeySelective() throws Exception {
    }

    @Test
    public void updateByPrimaryKey() throws Exception {
    }

}