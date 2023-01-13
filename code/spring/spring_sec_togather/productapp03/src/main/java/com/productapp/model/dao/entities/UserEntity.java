package com.productapp.model.dao.entities;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;
import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "user_table")
@ToString
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer uid;
    @Column(nullable = false, unique = true)
    private String email;//
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String mobile;

    @ElementCollection(fetch = FetchType.EAGER)
    @JoinColumn(name = "uid_fk")
    private List<String> profile=new ArrayList<>();

    public UserEntity(String email, String username, String password, String mobile, List<String> profile) {
        this.email = email;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.profile = profile;
    }
}
