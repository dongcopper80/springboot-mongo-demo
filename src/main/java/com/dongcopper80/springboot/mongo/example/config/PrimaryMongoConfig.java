/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dongcopper80.springboot.mongo.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 *
 * @author dongc
 */
@Configuration
@EnableMongoRepositories(basePackages = "com.dongcopper80.springboot.mongo.example.repository.primary", mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoConfig {
    
}
