package ex1.pessoas;

public class Governador {

	//atributos
	private String nome;
	private String partido;
	
	//construtor
	public Governador(String nome, String partido) {
		
		this.nome = nome;
		this.partido = partido;
	}

	//GET e SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}
	
	
	
	
}
