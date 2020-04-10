package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Random r = new Random();
		
		System.out.print("Informe o número de lançamentos: ");
		int n = scan.nextInt();
		
		
		int cont_cara = 0;
		int cont_coroa = 0;
		for (int i = 0; i < n; i++) {
			int x = r.nextInt(2);
			if(x==1) {
				System.out.println("Cara");
				cont_cara++;
			}
			else {
				System.out.println("Coroa");
				cont_coroa++;
			}
			
		}
		
		System.out.println("Cara sorteado "+cont_cara+" vezes");
		System.out.println("Coroa sorteado "+cont_coroa+" vezes");
		
		
		double porcentagemCara = (cont_cara * 100) / n;
		System.out.println("A porcentagem que saiu cara é de "+porcentagemCara+" %.");
		
		double porcentagemCoroa = (cont_coroa * 100) / n;
		System.out.println("A porcentagem que saiu cara é de "+porcentagemCoroa+" %.");
		
		scan.close();
	}

}
