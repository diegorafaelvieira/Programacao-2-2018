package ex2;

public class MovimentosBancarios {

	//atributos
	private double valor;
	private String descricao;
	
	//construtor
	public MovimentosBancarios(double valor, String descricao) {
		super();
		this.valor = valor;
		this.descricao = descricao;
	}

	//GET e SET
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
