package com.dongnd.ilearnapi.service;

import com.dongnd.ilearnapi.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> getUsers();
}
