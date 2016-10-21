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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUnico;
	
	private boolean desconto;
	
	@ManyToOne
	@JoinColumn(name = "promocao_id")
	private Promocao promo;	
	
	private double preco;
	
	private boolean estudante;
	
	@ManyToOne
	@JoinColumn(name = "vendaIngresso_id")
	private VendaDeIngresso venda;
	
	/*______________________________________________________*/

	public Ingresso() {
		super();
	}

	public Ingresso(boolean desconto, Promocao promo, double preco, boolean estudante) {
		super();
		this.desconto = desconto;
		this.promo = promo;
		this.preco = preco;
		this.estudante = estudante;
	}
	
	/*______________________________________________________*/

	public boolean isDesconto() {
		return desconto;
	}

	public void setDesconto(boolean desconto) {
		this.desconto = desconto;
	}

	public Promocao getPromo() {
		return promo;
	}

	public void setPromo(Promocao promo) {
		this.promo = promo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isEstudante() {
		return estudante;
	}

	public void setEstudante(boolean estudante) {
		this.estudante = estudante;
	}

	public VendaDeIngresso getVenda() {
		return venda;
	}

	public void setVenda(VendaDeIngresso venda) {
		this.venda = venda;
	}	
	
	/*______________________________________________________*/
	
	
   
}
