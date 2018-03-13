package com.dx.dao;

import com.dx.entity.User;
import java.util.List;

/**
 * Created by windows on 2018-03-12.
 */
public interface IHelloDao {

    //@Insert("INSERT INTO user(name,age) VALUES(#{name},#{age})")
    //添加用户
    int addUser(User user);

    //查看所有用户
    List<User> queryAllUser();

    //删除一个用户(根据id)
    int deleteUserById(Integer id);

    //修改用户信息(根据id)
    int updateUserById(User user);

}
