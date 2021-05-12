package br.edu.uffs.engSoftware.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.uffs.engSoftware.repository.RecursoRepository;

/**
 * @author felip
 * As classes controller, por obvio que pareça, "controlam" as URL's
 * Por exemplo, elas pegam uma Locacao que o cliente envia e simplesmente salvam
 * ou
 * para fazer coisas mais complexas chamam metodos em outras classes ex:
 * 		enviam os objetos que o cliente enviou para trocar de responsável e manda para o locacaoService.trocaResponsavel(x,y,z)" 
 */

@Controller
@RequestMapping("recurso")
public class RecursoController {
	
	@Autowired
	private RecursoRepository recursoRepository;
	
	@GetMapping("/explicacao")
	public String hello(HttpServletRequest request) {
		request.setAttribute("nomeQueVcQuerUsarNaView", "Aqui seria um objeto");
		return "teste";
	}
	
	@GetMapping("/cadastraRecurso")
	public String cadastraRecurso() {
		return "recurso/cadastraRecurso";
	}

}
