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

    private String email;//

    private String username;

    private String password;

    private String mobile;
    
    @ElementCollection(fetch = FetchType.EAGER)
    @JoinColumn(name = "uid_fk")
    private List<String> profile=new ArrayList<>();




}
