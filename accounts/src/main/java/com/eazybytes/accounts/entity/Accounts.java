package com.eazybytes.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Accounts extends BaseEntity
{
    private Long customerId;

    @Column(name = "account_number")
    @Id
    private long accountNumber;

    private String accountType;

    private String branchAddress;

}
