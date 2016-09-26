package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sessao
 *
 */
@Entity
public class Sessao implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	
	/*
	 * JoinColumn: Essa anotação indica que a chave estrangeira ficará dentro da tabela sessao,
	 *  fazendo com que a entidade Sessao seja a dona do relacionamento.
	 * */	
	@ManyToOne
	@JoinColumn(name = "filme_id")
	private Filme filme;
	
	private Sala sala;
	
	@Temporal(TemporalType.DATE)
	private Date dia;
	
	private Date horarioInicio;
	
	private Date horarioFim;
	
	private List<Ingresso> ingressos = new ArrayList<>();

	public Sessao() {
		super();
	}

	public Sessao(Filme filme, Sala sala, Date dia, Date horarioInicio, Date horarioFim) {
		super();
		this.filme = filme;
		this.sala = sala;
		this.dia = dia;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Date getDia() {
		return dia;
	}

	public void setDia(Date dia) {
		this.dia = dia;
	}

	public Date getHorarioInicio() {
		return horarioInicio;
	}

	public void setHorarioInicio(Date horarioInicio) {
		this.horarioInicio = horarioInicio;
	}

	public Date getHorarioFim() {
		return horarioFim;
	}

	public void setHorarioFim(Date horarioFim) {
		this.horarioFim = horarioFim;
	}

	private List<Ingresso> getIngressos() {
		return ingressos;
	}

	private void setIngressos(List<Ingresso> ingressos) {
		this.ingressos = ingressos;
	}
	
	
   
}
