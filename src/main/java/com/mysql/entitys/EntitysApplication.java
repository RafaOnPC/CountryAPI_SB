package com.mysql.entitys;

import com.mysql.entitys.conexion.ConnectionTest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EntitysApplication {

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(EntitysApplication.class, args);
		ConnectionTest connectionTest = context.getBean(ConnectionTest.class);
		connectionTest.run(); // Llamada al método run de ConnectionTest
	}
}

