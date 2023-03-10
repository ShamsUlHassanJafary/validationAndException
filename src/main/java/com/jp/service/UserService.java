package com.jp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jp.dto.UserDto;
import com.jp.exception.UserNotFoundException;
import com.jp.model.User;
import com.jp.repo.UserRepo;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User saveUser(UserDto userDto) {

        User user = User.build(0,
                userDto.getUsername(),
                userDto.getPassword(),
                userDto.getNationality(),
                userDto.getEmail(),
                userDto.getPhonenumber(),
                userDto.getGender(),
                userDto.getAge());

        return userRepo.save(user);
    }

    public User getUser(String email, String password) throws UserNotFoundException {

        User user = userRepo.findByEmailAndPassword(email, password);
        if (user != null) {
            return user;
        } else {
            throw new UserNotFoundException("username or password is wrong");
        }
    }
}