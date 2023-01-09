package com.bankapp.pk;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "add_table_pk")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
 public class Address {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   private String city;

    private String address;

    public Address(String city, String address) {
        this.city = city;
        this.address = address;
    }
}

