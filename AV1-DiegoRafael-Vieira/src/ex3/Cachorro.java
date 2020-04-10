package ex3;

public class Cachorro {

	//atributos
	private String nome;
	private String raca;
	
	//construtor
	public Cachorro(String nome, String raca) {
		
		this.nome = nome;
		this.raca = raca;
	}

	//GET e SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
