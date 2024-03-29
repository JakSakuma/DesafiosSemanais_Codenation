package br.com.semana2.Futebol;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Time {

	/*
	 * Long id* Identificador do time 
	 * String nome* Nome do Time 
	 * LocalDate dataCriacao* Data de criação do time 
	 * String corUniformePrincipal* Cor do uniforme principal do time 
	 * String corUniformeSecundario* Cor do uniforme secundário do time
	 * 
	 * Caso o identificador já exista, retornar br.com.codenation.desafio.exceptions.IdentificadorUtilizadoException
	 */
	
	private Long id;
	private String nome;
	private LocalDate dataCriacao;
	private String corUniformePrincipal;
	private String corUniformeSecundario;
	private Jogador capitao = null;
	private List<Jogador> jogadores = new ArrayList<Jogador>();
	
	public Time(Long id, String nome, LocalDate dataDeCriação, String corUniformePrincipal, String corUniformeSecundario) {

		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataDeCriação;
		this.corUniformePrincipal = corUniformePrincipal;
		this.corUniformeSecundario = corUniformeSecundario;
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public String getCorUniformePrincipal() {
		return corUniformePrincipal;
	}
	
	public void setCorUniformePrincipal(String corUniformePrincipal) {
		this.corUniformePrincipal = corUniformePrincipal;
	}
	public String getCorUniformeSecundario() {
		return corUniformeSecundario;
	}
	
	public void setCorUniformeSecundario(String corUniformeSecundario) {
		this.corUniformeSecundario = corUniformeSecundario;
	}
	
	public Jogador getCapitao() {
		return capitao;
	}

	public void setCapitao(Jogador capitao) {
		this.capitao = capitao;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(List<Jogador> jogadores) {
		
		this.jogadores = jogadores;
		System.out.println(this.jogadores );
	}

}
