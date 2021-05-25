package br.edu.uffs.engSoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author felip
 * É o que faz o projeto criar todo o banco e startar na porta 8080
 * Para configurar isto basta colocar os dados do seu banco no arquivo "application.properties" (login, senha, url, timezone)
 * e dentro do HTML "teste" tem maiores explicações sobre como funciona o Thymeleaf e spring
 * 
 * O texto no HTML teste faria mais sentido caso vc rode o programa e acesse "http://localhost:8080/recurso/explicacao"
 * É literalmente só rodar essa classe como aplicação java
 */

@SpringBootApplication
public class EngSoftwareApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngSoftwareApplication.class, args);
	}

}
