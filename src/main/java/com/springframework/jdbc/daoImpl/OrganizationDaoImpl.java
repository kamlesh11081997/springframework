package com.springframework.jdbc.daoImpl;

import com.springframework.jdbc.dao.OrganizationDao;
import com.springframework.jdbc.model.Organization;
import com.springframework.jdbc.model.QueryConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class OrganizationDaoImpl implements OrganizationDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public boolean create(Organization org) {
        return false;
    }

    @Override
    public Organization getOrganization(Integer id) {
        Object[] args=new Object[]{id};
        Organization org=jdbcTemplate.queryForObject(QueryConstant.GET_COMP_BY_ID,args,new OrganizationRowMapper());
        return org;
    }

    @Override
    public List<Organization> getAllOrganizations() {
        return null;
    }

    @Override
    public boolean delete(Organization org) {
        return false;
    }

    @Override
    public boolean update(Organization org) {
        return false;
    }

    @Override
    public void cleanup() {

    }
}
