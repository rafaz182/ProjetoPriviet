package br.edu.ifsp.sistemapriviet.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Filme
 *
 */
@Entity
public class Filme implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String tituloPortugues;
	
	private String tituloOriginal;
	
	private int duracao;
	
	private String diretor;
	
	private String ano;
	
	private String genero;
	
	private String sinopse;
	
	private String pais;
	
	private String linguagem;
	
	private boolean legenda;
	
	private int classificacao;
	
	/*
	 *  mappedBy: Esse atributo indica que a entidade Sessao é a dona do relacionamento; 
	 *  a chave estrangeira deve ficar na tabela Sessao e não na tabela Filme.
	 *  O atributo mappedBy deve apontar para o nome do atributo e não para o nome da classe.
	 * */
	
	/*
	 * Todo o relacionamento necessita que umas das entidades seja a “dona desse relacionamento”. 
	 * Ser dona do relacionamento nada mais é do ter a chave estrangeira na tabela do banco de dados.
	 * o mappedBy é utilizado para indicar que esse relacionamento não é o lado dominante.
	 * */
	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "filme")
	private List<Sessao> sessoes = new ArrayList<>();	

	public Filme() {
		super();
	}

	public Filme(String tituloPortugues, String tituloOriginal, int duracao, String diretor, String ano, String genero,
			String sinopse, String pais, String linguagem, boolean legenda, int classificacao) {
		super();
		this.tituloPortugues = tituloPortugues;
		this.tituloOriginal = tituloOriginal;
		this.duracao = duracao;
		this.diretor = diretor;
		this.ano = ano;
		this.genero = genero;
		this.sinopse = sinopse;
		this.pais = pais;
		this.linguagem = linguagem;
		this.legenda = legenda;
		this.classificacao = classificacao;
	}

	public String getTituloPortugues() {
		return tituloPortugues;
	}

	public void setTituloPortugues(String tituloPortugues) {
		this.tituloPortugues = tituloPortugues;
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getLinguagem() {
		return linguagem;
	}

	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}

	public boolean isLegenda() {
		return legenda;
	}

	public void setLegenda(boolean legenda) {
		this.legenda = legenda;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	private List<Sessao> getSessoes() {
		return sessoes;
	}

	private void setSessoes(List<Sessao> sessoes) {
		this.sessoes = sessoes;
	}
	
	public void addSessoes(Sessao sessao){
		this.getSessoes().add(sessao);
		sessao.setFilme(this);
	}
   
}
