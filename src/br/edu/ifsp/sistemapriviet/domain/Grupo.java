package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Grupo
 *
 */
@Entity
public class Grupo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Funcionalidade> func = new ArrayList<>();
	
	/*______________________________________________________*/

	public Grupo() {
		super();
	}

	public Grupo(String nome) {
		super();
		this.nome = nome;
	}
	
	/*______________________________________________________*/

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionalidade> getFunc() {
		return func;
	}
	
	/*______________________________________________________*/
	
	public void addFuncionalidade(Funcionalidade func){
		this.func.add(func);
		func.getGrupos().add(this);
	}
}
