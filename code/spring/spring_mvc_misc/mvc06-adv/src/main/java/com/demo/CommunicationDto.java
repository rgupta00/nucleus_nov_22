package com.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class CommunicationDto {
    private String email;
    private Phone phone;
}
