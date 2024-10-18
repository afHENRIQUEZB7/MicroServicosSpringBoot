package com.microservice.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients // se utiliza para que se pueda habilitar el cliente Feign en este microservicio y así poder hacer peticiones dentro de nuestros microservicios

// La anotación de @EnableDiscoveryClient se utiliza para indicar que es un cliente de eureka, no es necesario colocarla, pero pues se recomienda
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceCourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCourseApplication.class, args);
	}

}
