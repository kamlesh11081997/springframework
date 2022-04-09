package com.springframework.jdbc;

import com.springframework.jdbc.dao.OrganizationDao;
import com.springframework.jdbc.model.Organization;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JdbcTemplateClassApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(JdbcConfig.class);
        OrganizationDao dao=context.getBean("organizationDaoImpl",OrganizationDao.class);
        Organization org=dao.getOrganization(1);
        System.out.println(org.getCompanyName());
        System.out.println(org.getEmployeeCount());

        context.close();

    }
}
