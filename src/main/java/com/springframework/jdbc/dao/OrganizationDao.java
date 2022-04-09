package com.springframework.jdbc.dao;

import com.springframework.jdbc.model.Organization;
import java.util.List;

public interface OrganizationDao {
    public boolean create(Organization org);
    public Organization getOrganization(Integer id);
    public List<Organization> getAllOrganizations();
    public boolean delete(Organization org);
    public boolean update(Organization org);
    public void cleanup();
}
