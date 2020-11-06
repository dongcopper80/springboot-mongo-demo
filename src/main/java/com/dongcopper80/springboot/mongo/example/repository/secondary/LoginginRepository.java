/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dongcopper80.springboot.mongo.example.repository.secondary;

import com.dongcopper80.springboot.mongo.example.repository.model.Logingin;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author dongc
 */
public interface LoginginRepository extends MongoRepository<Logingin, Long>{
    
}
