package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Produto
 *
 */
@Entity
public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String codigoBarras;
	
	private String nome;
	
	private double preco;
	
	private int qntdMin;
	
	private int qntdMax;
	
	private int qntdAtual;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "produtos")
	private List<Promocao> promocoes = new ArrayList<Promocao>();
	
	/*______________________________________________________*/

	public Produto() {
		super();
	}

	public Produto(String codigoBarras, String nome, double preco, int qntdMin, int qntdMax, int qntdAtual) {
		super();
		this.codigoBarras = codigoBarras;
		this.nome = nome;
		this.preco = preco;
		this.qntdMin = qntdMin;
		this.qntdMax = qntdMax;
		this.qntdAtual = qntdAtual;
	}

	
	/*______________________________________________________*/
	
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQntdMin() {
		return qntdMin;
	}

	public void setQntdMin(int qntdMin) {
		this.qntdMin = qntdMin;
	}

	public int getQntdMax() {
		return qntdMax;
	}

	public void setQntdMax(int qntdMax) {
		this.qntdMax = qntdMax;
	}

	public int getQntdAtual() {
		return qntdAtual;
	}

	public void setQntdAtual(int qntdAtual) {
		this.qntdAtual = qntdAtual;
	}

	public List<Promocao> getPromocoes() {
		return promocoes;
	}
	
	/*______________________________________________________*/
	
	
   
}
