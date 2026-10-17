package br.senac.tads.dsw.dados_pessoais;

//etapa 00

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * pesquisei na internet e estas bibliotecas parecem não
 * rodar na versão atual do Spring boot do projeto, não consegui achar uma solução
 * vou deixar o código, mas eele ficará comentado.
 */

//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@GetMapping("/hello")
	public Mensagem hello() {
		return new Mensagem("Enzo de Oliveira", "Olá, mundo! Meu primeiro endpoint Spring Boot" );
	}

	/*
	@GetMapping(value = "/hello-manual", produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloManual() throws JsonProcessingException {
		Mensagem mensagem = new Mensagem("Seu Nome Completo", "JSON gerado manualmente com ObjectMapper.");
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(mensagem);
	}
	*/
}
