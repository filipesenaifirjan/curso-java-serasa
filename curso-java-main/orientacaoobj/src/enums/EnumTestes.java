package enums;

import enums.entidade.Endereco;
import enums.entidade.Pessoa;

public class EnumTestes {
	
	public static void main(String[] args) {
		
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("José");
		pessoa.setSobreNome("da Silva");
		pessoa.setIdade(45);
		pessoa.setRg("112223345");
		pessoa.setCpf("111222333-45");
		pessoa.setSexo(Sexo.MASCULINO);
		pessoa.setCorPele(CorPele.NAO_DECLARADO);
		
		Endereco endereco = new Endereco();
		endereco.setTipo(TipoLogradouro.RUA);
		endereco.setLogradouro("do Passeio");
		endereco.setComplemento("-");
		endereco.setNumero("38");
		endereco.setBairro("Cinelândia");
		endereco.setCidade("Rio de Janeiro");
		endereco.setEstado("RJ");	
		
		pessoa.setEndereco(endereco);
		pessoa.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		System.out.println("Pessoa: " + pessoa.toString());
		
	}

}
