package com.example.hoda_anisa.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDao {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
}
