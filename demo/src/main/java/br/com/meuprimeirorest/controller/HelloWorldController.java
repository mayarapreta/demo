package br.com.meuprimeirorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController /*para machine notar o controle quando executar, vao anota pelo site*/
public class HelloWorldController{
	
	@GetMapping("/helloworld") /*url vao anota pelo site*/
	public String helloworld(String nome ) {
		nome= " Maria";
		return "Hello World" + nome + "!";
	}
}