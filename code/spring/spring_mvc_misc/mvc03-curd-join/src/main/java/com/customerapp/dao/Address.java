package com.customerapp.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//DTo  id | name  | address | mobile    | email
@Entity
@Table(name = "add_table_hib_join")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int aid;
    private String addressLine;
    private String city;
    private String country;
    private String pinNumber;


}
