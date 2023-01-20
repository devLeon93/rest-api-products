package com.rapi.rapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author leonid.barsucovschi
 */

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User extends GeneralInfo{

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "email",unique = true,nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "user")
    private List<Product> products;


}
