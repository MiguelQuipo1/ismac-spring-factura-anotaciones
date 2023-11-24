package com.ditribuida.principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.distribuida.entities.Cliente;
import com.distribuida.entities.Factura;

@Configuration
@ComponentScan("com.distribuida")
@PropertySource("classpath:datosEmpresa.properties")	
public class Config {

	
	@Bean
	public Cliente cliente() {
		return new Cliente();
	}
//	@Bean
//	public Factura factura() {
//		return new Factura(cliente());
//	}
}
