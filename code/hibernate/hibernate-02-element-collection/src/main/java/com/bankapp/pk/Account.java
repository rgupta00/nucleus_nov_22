package com.bankapp.pk;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "acc_table_lifecycle")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
 public class Account {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;

   private String name;
   private BigDecimal balance;

   public Account(String name, BigDecimal balance) {
      this.name = name;
      this.balance = balance;
   }
}

