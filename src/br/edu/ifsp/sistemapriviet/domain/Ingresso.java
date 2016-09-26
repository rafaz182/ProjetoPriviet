package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ingresso
 *
 */
@Entity

public class Ingresso implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int idUnico;
	
	private double preco;
	
	private boolean desconto;
	
	private double valoDesconto;
	
	@Embedded
	private Promocao promo;	

	public Ingresso() {
		super();
	}
   
}
