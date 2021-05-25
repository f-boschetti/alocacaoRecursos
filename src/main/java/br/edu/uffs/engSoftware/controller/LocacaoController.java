package br.edu.uffs.engSoftware.controller;

import java.time.LocalDateTime;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.uffs.engSoftware.model.Locacao;
import br.edu.uffs.engSoftware.model.Recurso;
import br.edu.uffs.engSoftware.repository.LocacaoRepository;
import br.edu.uffs.engSoftware.repository.RecursoRepository;

/**
 * Explicação do que é e para que serve um controller em RecursoController.java
 */
@Controller
@RequestMapping("locacao")
public class LocacaoController {
	
	@Autowired
	private LocacaoRepository locacaoRepository;
	
	@Autowired
	private RecursoRepository recursoRepository;
	
	@GetMapping("/alocarRecurso/")
	public String alocarRecurso(Long recurso, HttpServletRequest request) {
		Recurso findById = recursoRepository.getOne(recurso);
		request.setAttribute("recursoSelecionado", findById);
		return "locacao/alocarRecurso";
	}
	
	@PostMapping("/realizarLocacao")
	public String realizarLocacao(Long quantidadeRecurso, Long idRecurso) {
		Recurso recursoLocado = recursoRepository.getOne(idRecurso);
		Locacao locacao = new Locacao();
		locacao.setHorarioLocacao(LocalDateTime.now());
		locacao.setQuantidadeLocada(quantidadeRecurso);
		locacao.setRecursoLocado(recursoLocado);
		locacaoRepository.save(locacao);
		return "recurso/filaEspera";
	}
}
