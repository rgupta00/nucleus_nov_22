package com.demo.value_mapping1;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Embeddable
public class Address {
    private String addressLine;
    private String city;
    private String country;
    private String pinCode;

    public Address(String addressLine, String city, String country, String pinCode) {
        this.addressLine = addressLine;
        this.city = city;
        this.country = country;
        this.pinCode = pinCode;
    }
}
