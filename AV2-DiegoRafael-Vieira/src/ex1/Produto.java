package ex1;

public class Produto implements Comparable<Produto> {

	//atributos
	private int codigo;
	private double preco;
	private String descricao;
	

	//construtor
	public Produto(int codigo, double preco, String descricao) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.descricao = descricao;
	}

	//GET e SET
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int compareTo(Produto prod) {
		// comparar pelo o nome aqui    this.descricao.compareto(prod.descricao)
		
		if (this.codigo > prod.codigo) {
			return 1;
		}
		if (this.codigo < prod.codigo) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	
	
	
}
