package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: VendaDeProduto
 *
 */
@Entity
public class VendaDeProduto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private double total;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Item> itens = new ArrayList<>();
	
	/*______________________________________________________*/

	public VendaDeProduto() {
		super();
	}

	public VendaDeProduto(double total, Date date, List<Item> itens) {
		super();
		this.total = total;
		this.date = date;
		this.itens = itens;
	}
	
	/*______________________________________________________*/

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Item> getItens() {
		return itens;
	}
	
	/*______________________________________________________*/
	
	public void addItem(Item item){
		this.itens.add(item);
		item.getVendasProduto().add(this);
	}
	
	
   
}
