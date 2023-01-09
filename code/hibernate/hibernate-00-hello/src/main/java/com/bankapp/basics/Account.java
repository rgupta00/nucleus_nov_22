package com.bankapp.basics;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "acc_table_2")
@Getter
@Setter
@ToString(exclude = {"tempCalcalation"}
)
@NoArgsConstructor
@EqualsAndHashCode
 public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acc_id")
    private Integer id;

    @Column(name = "acc_holder_name", nullable = false, length = 40)
    private String name;
    //XXXX.44
    @Column(name = "acc_balance", nullable = false, precision = 8)
    private BigDecimal balance;

    @Enumerated(EnumType.STRING) //if not given it will take 0 onward
    @Column(name = "customer_type")
    private CustomerType customerType;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Transient
    private int tempCalcalation;

   public Account(String name, BigDecimal balance, CustomerType customerType, Date date) {
      this.name = name;
      this.balance = balance;
      this.customerType = customerType;
      this.date = date;
   }
}
