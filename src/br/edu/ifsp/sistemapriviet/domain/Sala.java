package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sala
 *
 */
@Entity
public class Sala implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numeroSala;
	
	private int capacidade;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "sala")
	private List<Sessao> sessao = new ArrayList<>();
	
	/*______________________________________________________*/

	public Sala() {
		super();
	}	

	public Sala(int capacidade) {
		super();
		this.capacidade = capacidade;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		if(capacidade >= 0)
			this.capacidade = capacidade;
		else 
			this.capacidade = 0;
	}

	public List<Sessao> getSessao() {
		return sessao;
	}
   
}
