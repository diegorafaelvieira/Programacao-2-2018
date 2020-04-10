package ex3;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		ArrayList<Quadrado> figuras = new ArrayList<Quadrado>();
		
		Scanner scan = new Scanner(System.in);
		
		int opc = 0;
		int lado = 0;
		do {
			System.out.println("MENU");
			System.out.println("1 - Construir e calcular área de um Quadrado");
			System.out.println("2 - Construir e calcular área de um Cubo");
			System.out.println("3 - Sair");
			System.out.print("Opção:");
			try {
				opc = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Opção inválida.");
				//e.printStackTrace();
			}
			
			switch (opc) {
			case 1:// Quadrado
				System.out.print("Informe a medida do lado:");
				int ladoQ = scan.nextInt();
				System.out.println();
				// objeto quadrado
				figuras.add(new Quadrado(ladoQ)); 
				
				break;
				
			case 2:// Cubo
				System.out.print("Informe a medida do lado:");
				int ladoQ = scan.nextInt();
				System.out.println();
				// objeto quadrado
				figuras.add(new Cubo(ladoQ)); 
				
				break;

			case3: //sair
				System.out.println("SAINDO...");
				break;
			}
			
			
		} while (opc != 3);
		
		scan.close();

	}

}
