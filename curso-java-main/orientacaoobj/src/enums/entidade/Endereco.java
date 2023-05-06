package enums.entidade;

import enums.TipoLogradouro;

public class Endereco {

	private TipoLogradouro tipo;
	
	private String logradouro;
	private String complemento;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	
	public Endereco() {}
	
	
	public Endereco(TipoLogradouro tipo, String logradouro, String complemento, String numero, String bairro,
			String cidade, String estado) {
		this.tipo = tipo;
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}


	public TipoLogradouro getTipo() {
		return tipo;
	}


	public void setTipo(TipoLogradouro tipo) {
		this.tipo = tipo;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Endereco [tipo=" + tipo + ", logradouro=" + logradouro + ", complemento=" + complemento + ", numero="
				+ numero + ", bairro=" + bairro + ", cidade=" + cidade + ", estado=" + estado + "]";
	}
	
	
	
}

