package com.enoch.openschool.controller;

import com.enoch.openschool.dto.UserDto;
import com.enoch.openschool.service.UserService;
import com.enoch.openschool.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }
    @RequestMapping(Constants.GET_ALL_USERS)
    public List< UserDto > getAllUsers() {
        return userService.getAllUsers();
    }
    @RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
