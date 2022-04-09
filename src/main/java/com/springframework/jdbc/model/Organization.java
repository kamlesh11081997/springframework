package com.springframework.jdbc.model;

import lombok.Data;

@Data
public class Organization {
    private int id;
    private String companyName;
    private String yearOfIncorporation;
    private String postalCode;
    private int employeeCount;
    private String slogan;
}
