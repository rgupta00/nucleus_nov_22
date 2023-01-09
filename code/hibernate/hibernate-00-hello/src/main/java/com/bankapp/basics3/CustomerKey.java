package com.bankapp.basics3;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

//@Embeddable
@NoArgsConstructor  //dont forget to provide No arg constructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode  //dont forget to provide eq and hashcode
//Dont forget to imp mplements Serializable
public class CustomerKey implements Serializable {
    private String name;
    private String email;
}
