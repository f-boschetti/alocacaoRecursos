package br.edu.uffs.engSoftware.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.edu.uffs.engSoftware.enums.Categoria;

@Entity
public class Recurso {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String nome;

	// o que também pode ser feito é colocar isso como "recursoDisponivel" e a
	// locação se daria item a item, assim daria pra gerenciar os itens um a um
	private Long quantidade;

	// pode ser um enum "tipo"
	private String tipo;
	// acho que esses dois poderiam ser a mesma coisa talvez?!
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
