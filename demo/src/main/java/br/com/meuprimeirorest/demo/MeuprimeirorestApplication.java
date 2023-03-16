package br.com.meuprimeirorest.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.meuprimeirorest"})
public class MeuprimeirorestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeuprimeirorestApplication.class, args);
	}

}
