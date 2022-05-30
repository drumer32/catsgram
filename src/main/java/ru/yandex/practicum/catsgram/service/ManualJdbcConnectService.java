package ru.yandex.practicum.catsgram.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
@Service
public class ManualJdbcConnectService  {

    private Logger log = LoggerFactory.getLogger(getClass());
    public static final String JDBC_URL="jdbc:postgresql://127.0.0.1:5432/cats";
    public static final String JDBC_USERNAME="kitty";
    public static final String JDBC_DRIVER="org.postgresql.Driver";
    public static final String JDBC_PASSWORD="purrrrrr";

    public JdbcTemplate getTemplate() {
        DriverManagerDataSource dataSourceConst = new DriverManagerDataSource();
        dataSourceConst.setDriverClassName(JDBC_DRIVER);
        dataSourceConst.setUrl(JDBC_URL);
        dataSourceConst.setUsername(JDBC_USERNAME);
        dataSourceConst.setPassword(JDBC_PASSWORD);
        return new JdbcTemplate(dataSourceConst);
    }
}