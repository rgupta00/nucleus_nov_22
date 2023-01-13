package com.productapp.model.dao.entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
@Data
@NoArgsConstructor
@Entity
@Table(name = "cat_table")
@ToString
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cid;

    //how to manatain product count
    private String categoryType;

    public Category(String categoryType) {
        this.categoryType = categoryType;
    }
}
