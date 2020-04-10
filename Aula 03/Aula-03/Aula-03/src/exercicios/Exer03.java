package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		Random r =  new Random();
		
		System.out.print("Informe a quantidade de lançamentos: ");
		int qtd = scan.nextInt();
		
		int lado1 = 0;
		int lado2 = 0;
		int lado3 = 0;
		int lado4 = 0;
		int lado5 = 0;
		int lado6 = 0;
		for (int i = 0; i < qtd; i++) {
			
			int resultado = 1+r.nextInt(6);
			
			if (resultado == 1) {
				System.out.println("1");
				lado1++;
			} else if (resultado == 2) {
				System.out.println("2");
				lado2++;
			} else if (resultado == 3) {
				System.out.println("3");
				lado3++;
			} else if (resultado == 4) {
				System.out.println("4");
				lado4++;
			} else if (resultado == 5) {
				System.out.println("5");
				lado5++;
			} else if (resultado == 6 ) {
				System.out.println("6");
				lado6++;
			}
		}
		
		System.out.println("Lado 1 sorteado "+lado1+" vezes");
		System.out.println("Lado 2 sorteado "+lado2+" vezes");
		System.out.println("Lado 3 sorteado "+lado3+" vezes");
		System.out.println("Lado 4 sorteado "+lado4+" vezes");
		System.out.println("Lado 5 sorteado "+lado5+" vezes");
		System.out.println("Lado 6 sorteado "+lado6+" vezes");
		System.out.println();
		
		double porc1 = (lado1 * 100) / qtd;
		System.out.println("A porcentagem que saiu 1 é de "+porc1+" %.");
		double porc2 = (lado2 * 100) / qtd;
		System.out.println("A porcentagem que saiu 2 é de "+porc2+" %.");
		double porc3 = (lado3 * 100) / qtd;
		System.out.println("A porcentagem que saiu 3 é de "+porc3+" %.");
		double porc4 = (lado4 * 100) / qtd;
		System.out.println("A porcentagem que saiu 4 é de "+porc4+" %.");
		double porc5 = (lado5 * 100) / qtd;
		System.out.println("A porcentagem que saiu 5 é de "+porc5+" %.");
		double porc6 = (lado6 * 100) / qtd;
		System.out.println("A porcentagem que saiu 6 é de "+porc6+" %.");
		
		
		scan.close();

	}

}
