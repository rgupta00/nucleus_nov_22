package com.demo;

import com.demo.validation.Age;
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

    //we want to apply validation on date age must be bw 18 to 60 year
    @Age(minAge = 20, maxAge = 55, message = "age must be in range 20 to 55")
    private Integer age;
    @Past
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date  dob;
    private String[] hobbies;
    private String gender;
}
