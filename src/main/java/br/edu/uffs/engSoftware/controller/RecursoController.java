package br.edu.uffs.engSoftware.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.uffs.engSoftware.dao.RecursoDao;
import br.edu.uffs.engSoftware.model.Recurso;
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
	
	@RequestMapping(value = "/explicacao", method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
		request.setAttribute("nomeQueVcQuerUsarNaView", "Aqui seria um objeto");
		return "teste";
	}
	
	@RequestMapping(value = "/cadastraRecurso", method = RequestMethod.POST)
	public String cadastraRecurso(@Valid RecursoDao recurso) {
		recursoRepository.save(Recurso.transformaRecurso(recurso));
		return "recurso/cadastraRecurso";
	}
	@RequestMapping(value = "/cadastraRecurso", method = RequestMethod.GET)
	public String cadastraRecurso() {
		return "recurso/cadastraRecurso";
	}

	
	@RequestMapping(value ="/categoria", method = RequestMethod.GET)
	public String listaCategoria(RecursoDao recurso, HttpServletRequest request) {
		List<Recurso> lista = recursoRepository.findAllByCategoria(Recurso.transformaRecurso(recurso).getCategoria());
		request.setAttribute("listaDeItens", lista);
		return "recurso/categoria";
	}
	
	@RequestMapping(value ="/filaDeEspera", method = RequestMethod.GET)
	public String filaDeEspera() {
		return "recurso/filaEspera";
	}
	
	@RequestMapping(value ="/historico", method = RequestMethod.GET)
	public String historicoRecurso() {
		return "recurso/historico";
	}
	
	@RequestMapping(value ="/recurso", method = RequestMethod.GET)
	public String recurso() {
		return "recurso/recurso";
	}

}
