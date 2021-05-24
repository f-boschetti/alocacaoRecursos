package br.edu.uffs.engSoftware.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import br.edu.uffs.engSoftware.dao.RecursoDao;
import br.edu.uffs.engSoftware.enums.Categoria;

@Entity
public class Recurso implements Serializable {

	private static final long serialVersionUID = -4312987863539005148L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String nome;

	private Long quantidade;

	private String tipo;

	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	public Recurso() {
	}

	public Recurso(Long id, String nome, Long quantidade, String tipo, Categoria categoria) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.categoria = categoria;
	}

	public static Recurso transformaRecurso(RecursoDao recurso) {
		Recurso recursoReturn = new Recurso();
		recursoReturn.setCategoria(Categoria.getCategoriaByCodigo(recurso.getCategoria()));
		recursoReturn.setNome(recurso.getNome());
		recursoReturn.setQuantidade(recurso.getQuantidade());
		recursoReturn.setTipo(recurso.getTipo());
		return recursoReturn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
