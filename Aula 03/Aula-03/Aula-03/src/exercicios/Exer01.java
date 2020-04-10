package exercicios;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de valores: ");
		int qtd = scan.nextInt();
		
		int maior = 0;
		int menor = Integer.MAX_VALUE;
		for (int i = 0; i < qtd; i++) {
			
			System.out.print("Informe o "+(i+1)+"° valor: ");
			int valor = scan.nextInt();
			
			if(valor > maior) {
				maior = valor;
			} 
			
			if(valor < menor) {
				menor = valor;
			}
		}
		
		System.out.println("MAIOR VALOR: " + maior);
		System.out.println("MENOR VALOR: " + menor);
		
		scan.close();

	}

}
