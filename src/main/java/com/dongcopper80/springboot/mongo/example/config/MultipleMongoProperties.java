/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dongcopper80.springboot.mongo.example.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * @author dongc
 */
@Data
@ConfigurationProperties(prefix = "mongodb")
public class MultipleMongoProperties {
    
    private MongoProperties primary = new MongoProperties();
    private MongoProperties secondary = new MongoProperties();
}
