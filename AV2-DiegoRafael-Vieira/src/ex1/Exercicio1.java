package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Exercicio1 {

	public static void main(String[] args) {

		ArrayList<Produto> produtos = new ArrayList<Produto>();

		int opc = 0;

		Scanner scan = new Scanner(System.in);


		do {
			System.out.println("MENU");
			System.out.println("[1] - Cadastrar Produto");
			System.out.println("[2] - Exibir Produtos Cadastrados ");
			System.out.println("[3] - Ordenar Produtos pelo c�digo");
			System.out.println("[4] - SAIR");
			System.out.print("Op��o: ");
			try {
				opc = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("op��o inv�lida.");
				//e.printStackTrace();
			}

			switch (opc) {
			case 1: // cadastrar produto
				
				System.out.print("Digite o c�digo do produto: "); 
				int codigop = Integer.parseInt(scan.nextLine());
				
				System.out.print("Digite o pre�o do produto R$ ");
				double precop = scan.nextDouble(); 
				
				System.out.print("Digite a descri��o do produto: ");
				String descricaoP = scan.next();

				scan.nextLine();
				
				//objeto produto
			
				produtos.add(new Produto(codigop, precop, descricaoP));
				break;

			case 2: //exibir produtos cadastrados
				System.out.println("Produtos Cadastrados");
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println("C�digo: " + produtos.get(i).getCodigo());
					System.out.println("Pre�o R$ " + produtos.get(i).getPreco());
					System.out.println("Descri��o: " + produtos.get(i).getDescricao());
					System.out.println();
				}
				break;
				
			case 3: //ordenar produtos pelo o c�digo
				
				Collections.sort(produtos);
				
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println("C�digo: " + produtos.get(i).getCodigo());
					System.out.println("Pre�o R$ " + produtos.get(i).getPreco());
					System.out.println("Descri��o: " + produtos.get(i).getDescricao());
					System.out.println();
				}
			
			break;
			
			case 4:
				System.out.println("SAINDO...");
				break;

			}



			//rever parte ordena��o e erro do nextint


		} while (opc != 4);	
		scan.close();
	}
}
