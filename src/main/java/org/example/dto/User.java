package org.example.dto;


import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User {

    private Long id;
    private String userName;
    private String email;
    private String password;
    private String roll;

}
