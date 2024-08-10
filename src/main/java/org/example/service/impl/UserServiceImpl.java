package org.example.service.impl;

import org.example.dto.User;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public String register(User user) {
        return null;
    }
}
