package com.example.demoPractice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "admin")
public class Admin {
    @Id
    private String id; // Automatically generated by MongoDB
    private String username;
    private String password; // Hashed password
}
