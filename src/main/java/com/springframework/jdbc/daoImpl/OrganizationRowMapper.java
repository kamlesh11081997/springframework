package com.springframework.jdbc.daoImpl;

import com.springframework.jdbc.model.Organization;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrganizationRowMapper implements RowMapper<Organization> {
    @Override
    public Organization mapRow(ResultSet resultSet, int i) throws SQLException {
        Organization org=new Organization();
        org.setId(resultSet.getInt("id"));
        org.setCompanyName(resultSet.getString("companyName"));
        org.setYearOfIncorporation(resultSet.getString("yearOfIncorporation"));
        org.setPostalCode(resultSet.getString("postalCode"));
        org.setEmployeeCount(resultSet.getInt("employeeCount"));
        org.setSlogan(resultSet.getString("slogan"));
        return org;
    }
}
