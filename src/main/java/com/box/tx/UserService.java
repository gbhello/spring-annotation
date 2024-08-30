package com.box.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 描述
 *
 * @author gengbin29080
 * @date 2022/1/13
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void insertUser() {
        userDao.insert();
        int i =1/1;
        System.out.println("插入完成...");
    }
}
