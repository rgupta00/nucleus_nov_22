package com.bankapp.basics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AccountData {
    private String name;
    private BigDecimal balance;
}
