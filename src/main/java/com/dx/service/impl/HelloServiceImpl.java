package com.dx.service.impl;
import com.dx.dao.IHelloDao;
import com.dx.entity.User;
import com.dx.service.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by windows on 2018-03-12.
 */
@Service
public class HelloServiceImpl implements IHelloService{
    @Autowired
    private IHelloDao helloDao;

    @Override
    public int addUser(User user) {
        return helloDao.addUser(user);
    }

    @Override
    public List<User> getAllUser() {
        return helloDao.queryAllUser();
    }

    @Override
    public int deleteUserById(Integer id) {
        return helloDao.deleteUserById(id);
    }

    @Override
    public int updateUserById(User user) { return helloDao.updateUserById(user); }
}
