package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: VendaDeIngresso
 *
 */
@Entity
public class VendaDeIngresso implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private double total;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "venda")
	private List<Ingresso> ingressos = new ArrayList<>();	
	
	/*______________________________________________________*/
	
	public VendaDeIngresso() {
		super();
	}

	public VendaDeIngresso(double total, Date date, List<Ingresso> ingresso) {
		super();
		this.total = total;
		this.date = date;
		this.ingressos = ingresso;
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

	public List<Ingresso> getIngresso() {
		return ingressos;
	}
	
	/*______________________________________________________*/
	
	public void addIngresso(Ingresso ingresso){
		this.ingressos.add(ingresso);
		ingresso.setVenda(this);
	}
   
}
