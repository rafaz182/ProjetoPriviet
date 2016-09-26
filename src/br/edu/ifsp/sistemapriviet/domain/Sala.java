package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
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
	@GeneratedValue
	private int numeroSala;
	
	private int capacidade;
	
	private List<Sessao> sessoes;

	public Sala() {
		super();
	}
   
}
