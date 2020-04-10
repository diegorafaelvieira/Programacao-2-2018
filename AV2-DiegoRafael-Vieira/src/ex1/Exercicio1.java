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
			System.out.println("[3] - Ordenar Produtos pelo código");
			System.out.println("[4] - SAIR");
			System.out.print("Opção: ");
			try {
				opc = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("opção inválida.");
				//e.printStackTrace();
			}

			switch (opc) {
			case 1: // cadastrar produto
				
				System.out.print("Digite o código do produto: "); 
				int codigop = Integer.parseInt(scan.nextLine());
				
				System.out.print("Digite o preço do produto R$ ");
				double precop = scan.nextDouble(); 
				
				System.out.print("Digite a descrição do produto: ");
				String descricaoP = scan.next();

				scan.nextLine();
				
				//objeto produto
			
				produtos.add(new Produto(codigop, precop, descricaoP));
				break;

			case 2: //exibir produtos cadastrados
				System.out.println("Produtos Cadastrados");
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println("Código: " + produtos.get(i).getCodigo());
					System.out.println("Preço R$ " + produtos.get(i).getPreco());
					System.out.println("Descrição: " + produtos.get(i).getDescricao());
					System.out.println();
				}
				break;
				
			case 3: //ordenar produtos pelo o código
				
				Collections.sort(produtos);
				
				for (int i = 0; i < produtos.size(); i++) {
					System.out.println("Código: " + produtos.get(i).getCodigo());
					System.out.println("Preço R$ " + produtos.get(i).getPreco());
					System.out.println("Descrição: " + produtos.get(i).getDescricao());
					System.out.println();
				}
			
			break;
			
			case 4:
				System.out.println("SAINDO...");
				break;

			}



			//rever parte ordenação e erro do nextint


		} while (opc != 4);	
		scan.close();
	}
}
