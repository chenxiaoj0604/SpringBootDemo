package com.dx.dao;

import com.dx.entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by windows on 2018-03-13.
 */
public class IHelloDaoTest {

    private IHelloDao helloDao;

    @Test
    public void addUser() throws Exception {
    }

    @Test
    public void queryAllUser() throws Exception {
        List<User> uList = helloDao.queryAllUser();
        for (int i=0;i<uList.size();i++){
            System.out.println(uList.get(i));
        }
    }

    @Test
    public void deleteUserById() throws Exception {
    }

    @Test
    public void updateUserById() throws Exception {
    }

}