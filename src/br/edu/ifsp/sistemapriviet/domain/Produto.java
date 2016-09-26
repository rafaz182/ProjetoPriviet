package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Entity

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int id;
	
	private int codigoBarras;
	
	private String nome;
	
	private double preco;	

	public Produto() {
		super();
	}
   
}
