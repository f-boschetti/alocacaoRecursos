package br.edu.uffs.engSoftware.dao;

public class RecursoDao {

	private String nome;

	private Long quantidade;

	private String tipo;

	private Long categoria;

	public RecursoDao() {
	}

	public RecursoDao(String nome, Long quantidade, String tipo, Long categoria) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.tipo = tipo;
		this.categoria = categoria;
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

	public Long getCategoria() {
		return categoria;
	}

	public void setCategoria(Long categoria) {
		this.categoria = categoria;
	}

}
