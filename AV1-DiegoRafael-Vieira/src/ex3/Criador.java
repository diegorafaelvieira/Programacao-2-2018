package ex3;

public class Criador extends Pessoa {

	//atributos
	private Cachorro cachorro;

	//construtor
	public Criador(String nome, Cachorro cachorro) {
		super(nome);
		this.cachorro = cachorro;
		
	}

	
	//GET e SET
	public Cachorro getCachorro() {
		return cachorro;
	}

	
	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}
	

	
}
