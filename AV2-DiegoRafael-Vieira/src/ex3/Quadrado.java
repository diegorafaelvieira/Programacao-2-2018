package ex3;

public abstract class Quadrado  {

	//atributos
	private int lado;

	//construtor
	public Quadrado(int lado) {
		super();
		this.lado = lado;
	}

	//GET e SET
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	//metodo
	public int calcularAreaQuadrado(int lado) {
		return lado*lado;
	}
	
	
	
}

