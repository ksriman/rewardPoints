package com.sriman.retail.crp.controller;

import com.sriman.retail.crp.entity.User;
import com.sriman.retail.crp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * The type User controller.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Create user response entity.
     *
     * @param userDto the user dto
     * @return the response entity
     */
    @PostMapping("/adduser")
    public ResponseEntity<User> createUser(@Valid @RequestBody User userDto) {
        User createUserDto = this.userService.createUser(userDto);
        return new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
    }
}
