package br.edu.uffs.engSoftware.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author felip 
 *	Todas essas classes .model são as representaçoes em objetos na tabela do banco de dados
 *	
 *	id gerado pelo banco
 */
@Entity
public class Denuncia {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String denuncia;
	
	public Denuncia() {
	}

	public Denuncia(Long id, String denuncia) {
		this.id = id;
		this.denuncia = denuncia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(String denuncia) {
		this.denuncia = denuncia;
	}

}