package com.xzh.service.serviceImpl;

import com.xzh.dao.UserRepository;
import com.xzh.pojo.User;
import com.xzh.service.UserService;
import com.xzh.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
