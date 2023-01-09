package com.customerapp.dao;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

//DTo  id | name  | address | mobile    | email
@Entity
@Table(name = "cust_table_hib_join")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    private String name;
    private String mobile;
    private String email;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "cid_fk")
    private Address address;

}
