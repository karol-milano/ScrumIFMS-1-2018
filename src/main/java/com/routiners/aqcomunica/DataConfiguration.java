package com.routiners.aqcomunica;

import java.net.URISyntaxException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataConfiguration {
	
	@Bean
    public BasicDataSource dataSource() throws URISyntaxException {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setUrl("jdbc:postgresql://localhost:5432/jeferson");
        basicDataSource.setUsername("jeferson");
        basicDataSource.setPassword("Bjhbdsk21");

        return basicDataSource;
    }
	
}
