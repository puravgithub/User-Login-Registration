package com.javaman.userregistrationlogin.service;

import com.javaman.userregistrationlogin.dto.UserDto;
import com.javaman.userregistrationlogin.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
