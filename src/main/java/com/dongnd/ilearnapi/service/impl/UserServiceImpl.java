package com.dongnd.ilearnapi.service.impl;

import com.dongnd.ilearnapi.model.User;
import com.dongnd.ilearnapi.repository.UserRepository;
import com.dongnd.ilearnapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
