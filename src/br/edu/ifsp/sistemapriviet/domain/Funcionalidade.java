package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Funcionalidade
 *
 */
@Entity
public class Funcionalidade implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "func")
	private List<Grupo> grupos = new ArrayList<>();
	
	/*______________________________________________________*/

	public Funcionalidade() {
		super();
	}

	public Funcionalidade(String nome) {
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

	
	public List<Grupo> getGrupos() {
		return grupos;
	}
		
	/*______________________________________________________*/
   
}
