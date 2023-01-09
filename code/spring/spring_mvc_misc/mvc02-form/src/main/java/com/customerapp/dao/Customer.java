package com.customerapp.dao;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

//DTo  id | name  | address | mobile    | email
@Entity
@Table(name = "cust_table_hib")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String email;
    private String customerType;
    private boolean gender;
    private String framework;



}
