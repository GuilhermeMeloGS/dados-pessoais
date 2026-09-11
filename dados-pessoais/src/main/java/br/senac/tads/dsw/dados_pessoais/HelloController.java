package br.senac.tads.dsw.dados_pessoais;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public Mensagem hello(){
		return new Mensagem("Guilherme Melo","Olá, mundo! Meu primeiro endpoint Spring Boot");
	}

	@GetMapping(value = "/hello-manual", produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloManual() throws JsonProcessingException {
		Mensagem mensagem = new Mensagem("Guilherme Melo","Olá, mundo! Meu primeiro endpoint Spring Boot");
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(mensagem);
	}
}
