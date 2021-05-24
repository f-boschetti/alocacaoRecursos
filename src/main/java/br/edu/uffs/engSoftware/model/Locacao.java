package br.edu.uffs.engSoftware.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

/**
 * @author felip Todas essas classes .model são as representaçoes em objetos na
 *         tabela do banco de dados
 *         
 *         id gerado pelo banco
 *         data e hora da locação
 *         e um recurso (que é o que vai ser alocado) aqui acho que daria pra fazer também um "um pra muitos" de locação para recursos
 * 
 */
@Entity
public class Locacao implements Serializable{

	private static final long serialVersionUID = 8774707000230206079L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;

	private LocalDateTime horarioLocacao;

	@OneToOne
	@JoinTable(name = "recurso_locado")
	private Recurso recursoLocado;
	
	public Locacao(){
	}

	public Locacao(Long id, LocalDateTime horarioLocacao, Recurso recursoLocado) {
		super();
		this.id = id;
		this.horarioLocacao = horarioLocacao;
		this.recursoLocado = recursoLocado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getHorarioLocacao() {
		return horarioLocacao;
	}

	public void setHorarioLocacao(LocalDateTime horarioLocacao) {
		this.horarioLocacao = horarioLocacao;
	}

	public Recurso getRecursoLocado() {
		return recursoLocado;
	}

	public void setRecursoLocado(Recurso recursoLocado) {
		this.recursoLocado = recursoLocado;
	}

}