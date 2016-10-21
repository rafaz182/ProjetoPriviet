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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
		
	@ManyToOne
	@JoinColumn(name = "filme_id")
	private Filme filme;
	
	@ManyToOne
	@JoinColumn(name = "sala_id")
	private Sala sala;
	
	@Temporal(TemporalType.DATE)
	private Date dia;
	
	@Temporal(TemporalType.TIME)
	private Date horarioInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horarioFim;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "sessao_id")
	private List<Ingresso> ingressos = new ArrayList<>();
	
	/*______________________________________________________*/

	public Sessao() {
		super();
	}

	public Sessao(Filme filme, Date dia, Date horarioInicio, Date horarioFim) {
		super();
		this.filme = filme;
		this.dia = dia;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
	}

	/*______________________________________________________*/
	
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

	public List<Ingresso> getIngressos() {
		return ingressos;
	}
	
	/*______________________________________________________*/
	
	public void addIngresso(Ingresso ingre){
		this.ingressos.add(ingre);
	}
	
	public void addSala(Sala sala){
		/* Verificação se a sala não está em uso no horário de cadastro da sessão*/
		
		this.sala = sala;
		sala.getSessao().add(this);
	}
   
}
