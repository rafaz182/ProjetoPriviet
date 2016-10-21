package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Item
 *
 */
@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private float valor;
	
	private int quantidade;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "itens")
	private List<VendaDeProduto> vendasProduto = new ArrayList<>();
	
	/*______________________________________________________*/

	public Item() {
		super();
	}

	public Item(float valor, int quantidade, Produto produto) {
		super();
		this.valor = valor;
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	/*______________________________________________________*/

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public List<VendaDeProduto> getVendasProduto() {
		return vendasProduto;
	}
	
	/*______________________________________________________*/

	public void reduzQuantidade(){
		this.quantidade--;
	}
	
	
   
}
