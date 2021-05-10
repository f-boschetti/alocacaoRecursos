package br.edu.uffs.engSoftware.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 * @author felip
 * Todas essas classes .model são as representaçoes em objetos na tabela do banco de dados
 * um usuario tem
 * 		id gerado pelo banco
 * 		nome
 * 		função, que talvez possa ser um enum
 * 		matricula
 * 		um relacionamento um para muitos com denuncia (um usuario pode ter muitas denuncias)
 * 		um relacionamento um para muitos com locacoes (um usuario pode ter muitas locacoes)
 * 		tabela de join é a escrita ali
 */
@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private String nome;

	private String funcao;

	private Long matrigula;
	
	@OneToMany
	@JoinTable(name = "usuario_denuncias")
	private Set<Denuncia> denuncias;

	@OneToMany
	@JoinTable(name = "usuario_locacoes")
	private Set<Locacao> locacoes;
	
	public Usuario() {

	}

	public Usuario(Long id, String nome, String funcao, Long matrigula, Set<Denuncia> denuncias, Set<Locacao> alocacoes) {
		this.id = id;
		this.nome = nome;
		this.funcao = funcao;
		this.matrigula = matrigula;
		this.denuncias = denuncias;
		this.locacoes = alocacoes;
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

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Long getMatrigula() {
		return matrigula;
	}

	public void setMatrigula(Long matrigula) {
		this.matrigula = matrigula;
	}

	public Set<Denuncia> getDenuncias() {
		return denuncias;
	}

	public void setDenuncias(Set<Denuncia> denuncias) {
		this.denuncias = denuncias;
	}

	public Set<Locacao> getAlocacoes() {
		return locacoes;
	}

	public void setAlocacoes(Set<Locacao> alocacoes) {
		this.locacoes = alocacoes;
	}

}