package br.senac.tads.dsw.dados_pessoais;

//etapa 00
//import com.fasterxml.jackson.core.JsonProcessingException;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@GetMapping("/hello")
	public Mensagem hello() {
		return new Mensagem("Enzo de Oliveira", "Olá, mundo! Meu primeiro endpoint Spring Boot" );
	}
}
