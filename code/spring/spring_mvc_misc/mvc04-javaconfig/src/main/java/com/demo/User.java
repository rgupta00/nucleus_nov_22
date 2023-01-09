package com.demo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class User {
    private int id;
    @NotBlank(message = "username must not be null")
    @Size(min=3, max = 30, message = "username must be min 4 char")
    private String username;

    private String password;
    private String country;

    private  CommunicationDto communicationDto;

    private String phone;
    private int age;
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date  dob;
    private String[] hobbies;
    private String gender;
}
