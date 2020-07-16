package com.legendcf.user.service.controller;

import com.legendcf.user.api.entity.User;
import com.legendcf.user.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * 用户
 *
 * @author qiuxb
 * @date 2020/7/8
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Optional<User> optional = userRepository.findById(id);
        return optional.orElse(null);
    }
}
