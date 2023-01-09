package com.demo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Phone {
    private String countryCode;
    private String phoneNumber;
}
