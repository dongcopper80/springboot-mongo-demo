/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dongcopper80.springboot.mongo.example.controller;

import com.dongcopper80.springboot.mongo.example.repository.model.User;
import com.dongcopper80.springboot.mongo.example.repository.primary.UserRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dongc
 */
@RestController
@RequestMapping("/api/user")
@Api(value = "user", description = "API quản lý người dùng")
public class UserController {
    
    @Autowired
    private UserRepository userRepository;
    
    @ApiOperation(value = "Tạo người dùng mới")
    @RequestMapping(value = "/create", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ResponseEntity<String> create(@RequestBody User user) {
        userRepository.save(user);
        return new ResponseEntity<>("Thank you for register", HttpStatus.OK);
    }
}
