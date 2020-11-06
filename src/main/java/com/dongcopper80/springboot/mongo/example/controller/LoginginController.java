/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dongcopper80.springboot.mongo.example.controller;

import com.dongcopper80.springboot.mongo.example.repository.secondary.LoginginRepository;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dongc
 */
@RestController
@RequestMapping("/api/logingin")
@Api(value = "logingin", description = "API trace user login")
public class LoginginController {
    
    @Autowired
    private LoginginRepository loginginRepository;
}
