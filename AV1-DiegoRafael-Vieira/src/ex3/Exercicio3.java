package ex3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		
		Criador[] criadores = new Criador[2];
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < criadores.length; i++) {

			
			System.out.print("Nome criador: ");
			String nomeCriador = scan.next();
			
			System.out.print("Nome cachorro");
			String nomeCachorro = scan.next();
			System.out.print("Raça cachorro: ");
			String racaCachorro = scan.next();
			
			//Objeto Criador
			criadores[i] = new Criador(nomeCriador, nomeCachorro);
			
			 
		}
		
		
		
		scan.close();

	}



}
