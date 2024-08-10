package org.example.service;

import org.example.dto.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {

    public boolean login(User user);
    public String register(User user);
}
