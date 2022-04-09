package com.springframework.jdbc.model;

public final class QueryConstant {
    public final static String GET_COMP_BY_ID="SELECT id,companyname,yearofincorporation,postalcode,employeecount," +
            "slogan FROM companydata.organization WHERE id =?";
}
