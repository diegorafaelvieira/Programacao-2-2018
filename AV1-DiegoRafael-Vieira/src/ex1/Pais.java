package ex1;

import ex1.pessoas.Presidente;

public class Pais {

	//atributos
	private Presidente presidente;
	private String nome;
	
	//construtor
	public Pais(Presidente presidente, String nome) {
		
		this.presidente = presidente;
		this.nome = nome;
	}

	//GET e SET
	public Presidente getPresidente() {
		return presidente;
	}

	public void setPresidente(Presidente presidente) {
		this.presidente = presidente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
