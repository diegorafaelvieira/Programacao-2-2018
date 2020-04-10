package exemplos;

import java.util.Random;

public class Exemplo3 {

	public static void main(String[] args) {
		
		// gera randomico
		Random r = new Random();
		
		for (int i = 0; i < 30; i++) {
			System.out.print(1+r.nextInt(6) + " ");
		}
		
		//quantos mais aleatórios mais próximo de 50%
		
		//System.out.println(r.nextInt(6)); // gera de 0 até 5
		
		//System.out.println(1+r.nextInt(6)); // gera como se fosse um dado
		
	}

}
