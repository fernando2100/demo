package com.example.demo;

import javax.naming.NamingException;
import javax.sql.DataSource;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import mx.capacitarte.rycmvcweb2.util.Constantes;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setContextPath(Constantes.CONTEXT_PATH);
	}
	
	@SuppressWarnings("rawtypes")
	@Bean
	public DataSource dataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.url("jdbc:oracle:thin:@//Fernando-OTN:1521/xepdb1");
		dataSourceBuilder.driverClassName("oracle.jdbc.driver.OracleDriver");
		dataSourceBuilder.username("user_web");
		dataSourceBuilder.password("user_web");
		return dataSourceBuilder.build();
	}
	@Bean
	public DataSourceTransactionManager transactionManager() throws IllegalArgumentException, NamingException {
		return new DataSourceTransactionManager(dataSource());
		//return new DataSourceTransactionManager(jndiDataSource());
	}

	
}
