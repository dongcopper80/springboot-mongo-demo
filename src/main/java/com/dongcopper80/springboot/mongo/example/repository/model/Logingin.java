/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dongcopper80.springboot.mongo.example.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author dongc
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "logingin")
public class Logingin {
    
    @Id
    private Long logid;
    private String username;
    private String ip;
}
