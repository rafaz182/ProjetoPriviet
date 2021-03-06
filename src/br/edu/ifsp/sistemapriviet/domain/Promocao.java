package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Promocao
 *
 */
@Entity
public class Promocao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Produto> produtos = new ArrayList<Produto>();
	
	private double total;
	
	private boolean ativo;
	
	/*______________________________________________________*/

	public Promocao() {
		super();
	}
	
	public Promocao(String nome, double total, boolean ativo) {
		super();
		this.nome = nome;
		this.total = total;
		this.ativo = ativo;
	}

	/*______________________________________________________*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}	
	
	/*______________________________________________________*/
	
	public void addProtudo(Produto produto){
		this.produtos.add(produto);
		produto.getPromocoes().add(this);
	}
   
}
