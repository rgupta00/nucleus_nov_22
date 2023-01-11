package com.demo.one2many2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
@Table(name = "product_table_quaries")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long pid;
    private String name;
    private String description;
    private double price;

    @ManyToOne
    @JoinColumn(name = "cid_fk")
    private Category category;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

}