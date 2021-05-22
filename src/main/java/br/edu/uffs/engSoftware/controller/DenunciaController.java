package br.edu.uffs.engSoftware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.uffs.engSoftware.repository.DenunciaRepository;

@Controller
@RequestMapping("denuncia")
public class DenunciaController {
	
	@Autowired
	private DenunciaRepository denunciaRepository;
	
	@GetMapping("/registrarDenuncia")
	public String registraDenuncia() {
		return "denuncia/denuncia";
		
	}

}
