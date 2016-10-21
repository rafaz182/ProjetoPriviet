package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	private int idade;
	
	private String sexo;
	
	@ManyToOne
	@JoinColumn(name = "grupo_id")
	private Grupo grupo;	
	
	private String login;
	
	private String senha;
	
	private String email;	
	
	/*______________________________________________________*/

	public Usuario() {
		super();
	}

	public Usuario(String nome, int idade, String sexo, Grupo grupo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.grupo = grupo;
	}

	/*______________________________________________________*/
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
		
	/*______________________________________________________*/	
   
}
