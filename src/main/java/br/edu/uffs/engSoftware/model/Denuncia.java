package br.edu.uffs.engSoftware.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


/**
 * @author felip 
 *	Todas essas classes .model são as representaçoes em objetos na tabela do banco de dados
 *	
 *	id gerado pelo banco
 */
@Entity
public class Denuncia implements Serializable{

	private static final long serialVersionUID = -5262506417478212932L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	@NotBlank
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