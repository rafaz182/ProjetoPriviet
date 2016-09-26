package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Promocao
 *
 */
@Embeddable
public class Promocao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String nome;
	
	private List<Produto> produtos;
	
	private double total;
	
	private boolean ativo;

	public Promocao() {
		super();
	}
   
}
