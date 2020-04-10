package ex1;

import ex1.pessoas.Prefeito;

public class Cidade {

	//atributos
	private Prefeito prefeito;
	private Estado estado;
	private String nome;
	
	//cosntrutor
	public Cidade(Prefeito prefeito, Estado estado, String nome) {
		
		this.prefeito = prefeito;
		this.estado = estado;
		this.nome = nome;
	}

	//GET e SET
	public Prefeito getPrefeito() {
		return prefeito;
	}

	public void setPrefeito(Prefeito prefeito) {
		this.prefeito = prefeito;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
