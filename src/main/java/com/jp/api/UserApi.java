package com.jp.api;

import com.jp.exception.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jp.dto.UserDto;
import com.jp.model.User;
import com.jp.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
public class UserApi {

    private final UserService userService;

    @Autowired
    public UserApi(UserService userService) {

        this.userService = userService;
    }

    @PostMapping("/save")
    public User savUser(@RequestBody @Valid UserDto userDto) {
        return userService.saveUser(userDto);
    }

    @GetMapping("/getuser")
    public User getUser(@Param("email") String email, @Param("password") String password) throws UserNotFoundException {

        return userService.getUser(email, password);
    }
}
