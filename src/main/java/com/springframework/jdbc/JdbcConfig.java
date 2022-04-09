package com.springframework.jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.springframework.jdbc")
@PropertySource(value= {"classpath:database.properties"})
public class JdbcConfig {

    @Value("${jdbc.driverClassName}")
    private String driverName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String userName;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public JdbcTemplate getJdbcTemplate() throws ClassNotFoundException {
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        //SimpleDriverDataSource dataSource=new SimpleDriverDataSource();
        dataSource.setDriverClassName(driverName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        return new JdbcTemplate(dataSource);
    }
}
