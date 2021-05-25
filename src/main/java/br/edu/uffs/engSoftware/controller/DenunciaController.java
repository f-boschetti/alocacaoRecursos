package br.edu.uffs.engSoftware.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.uffs.engSoftware.model.Denuncia;
import br.edu.uffs.engSoftware.repository.DenunciaRepository;

/**
 * Explicação do que é e para que serve um controller em RecursoController.java
 */
@Controller
@RequestMapping("denuncia")
public class DenunciaController {
	
	@Autowired
	private DenunciaRepository denunciaRepository;
	
	@GetMapping("/registrarDenuncia")
	public String registraDenuncia(String textoDenuncia) {
		if (textoDenuncia != null &&textoDenuncia.length() != 0 && textoDenuncia.replaceAll(" ", "").length() != 0) {
			Denuncia denuncia = new Denuncia();
			denuncia.setDenuncia(textoDenuncia);
			denunciaRepository.save(denuncia);
		}
		
		
		return "denuncia/denuncia";
		
	}

}
