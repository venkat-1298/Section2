package com.eazybytes.accounts.dto;

import jakarta.validation.constraints.*;
import lombok.Data;


@Data
public class CustomerDto {

    @NotEmpty(message = " Name Can not be a empty or null")
    @Size(min = 5, max=30,message = "the length of the customer name should be between 5 to 30")
    private String name;

    @NotEmpty(message = "")
    @Email(message = "Email address should be a valid value")
    private String email;

    @Pattern(regexp = "($|[0-9]{10})", message = "Mobile number should be a 10 digits")
    private String mobileNumber;

    private AccountsDto accountsDto;
}
