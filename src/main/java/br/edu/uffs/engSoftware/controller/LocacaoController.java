package br.edu.uffs.engSoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.uffs.engSoftware.repository.LocacaoRepository;

@Controller
@RequestMapping("locacao")
public class LocacaoController {
	
	@Autowired
	private LocacaoRepository locacaoRepository;
	
	
	@GetMapping("/alocarRecurso")
	public String alocarRecurso() {
		return "locacao/alocarRecurso";
	}
}
