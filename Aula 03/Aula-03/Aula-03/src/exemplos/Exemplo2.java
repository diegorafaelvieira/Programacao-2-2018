package exemplos;

public class Exemplo2 {

	public static void main(String[] args) {
		
		double v1 = Math.ceil(1.7);   //ceil arredondamento para cima
		double v2 = Math.floor(2.1);  // floor arredonda para baixo
		double v11 = Math.round(1.4); // round arredonda para o valor mais próximo 
		double v12 = Math.round(1.4); // round arredonda para o valor mais próximo 
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v11);
		System.out.println(v12);
		
		double a = Math.abs(-1); //abs se tem valor negativo faz virar positivo
		System.out.println(a);
		
		double m1 = Math.max(-2, 3); //max pega o maior entre os 2 números
		double m2 = Math.min(-2, 3); //min pega o menor valor entre os 2 números
		System.out.println(m1);
		System.out.println(m2);
		
		double r = Math.sqrt(9); // raiz quadrada
		System.out.println(r);
		double p = Math.pow(3, 2); // potenciaçãa (base,expoente)
		System.out.println(p);
		
		int x = soma(10, 20);
		System.out.println(x);
	}
	
		public static int soma(int a, int b) { //funcao que faz a soma (função estática)
			return a+b;
	} 
		

}
