package Ex4;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

/* 4- Escreva uma classe que represente um país. Um país é representado atraves dos atributos: Código ISO 3166-1
 * (ex.:Brasil);população(ex.:193.446.886) e sua dimessao em KM2(ex.:8.515.767,049). Além disso,cada país mantem uma lista de outros países
 * com os quais faz fronteira.
 * Escreva a classe em java e seus membros a seguir:
 * A) Construtor que inicia o ISO, o nome e a dimessao do País;
 * B) Métodos de acesso(getter/Setter) para as propriedades codigo ISO, nome,população e dimessão do pais  .
 * C) Um metodo que permite verificar se dois objetos representam o mesmo país(igualdade semantica). Dois países são iguais se tiverem o mesmo codigo ISO;
 * D) um metodo que informe se o outro pais e limitrofe do pais que recebeu a mensagem;
 * E) um metodo que retorne a densidade populacional do pais;
 * F) um metodo que receba um país como parametro e retorne a lista de vizinhos comuns aos dois paises.
 * Considere que um pais tem  no maximo 40 outros paises com os quais ele faz fronteira.
 * 
 * 
 * */
public class Pais {
	
	 private String codigoISO;	
	 private String nome;
	 private long populacao;
	 private double dimensao;
	 
	 private List<String> paisesFronteiricos = new ArrayList<>();
	 
	 
	public Pais(String codigoISO, String nome, double dimensao) {
		this.codigoISO = codigoISO;
		this.nome = nome;
		this.dimensao = dimensao;
	}

	
	public String getCodigoISO() {
		return codigoISO;
	}

	public void setCodigoISO(String codigoISO) {
		this.codigoISO = codigoISO;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = dimensao;
	}
	
	public List<String> getPaisesFronteiricos() {
		return paisesFronteiricos;
	}


	@Override
	public int hashCode() {
		return Objects.hash(codigoISO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		return Objects.equals(codigoISO, other.codigoISO);
	}
	
	 public boolean isLimitrofe(String pais) {
		 return getPaisesFronteiricos().contains(pais);
	 }
	 public double getDensidadePopulacional() {
		 return this.populacao / this.dimensao;
	 }
	 public List<String> getPaisesFronteiricosEmComum(Pais pais){
		 // Criar a lista vazia que sera retornada preenchida;
		 //Iterar sobre a lista de um pais;
		 //verificar se o item atual esta contido na lista do outro pais;
		 // se estiver adicionar a uma lista que sera retornado;
		 // Retorna a lista preenchida;
		 return null; 	 
	  }
	
} 







