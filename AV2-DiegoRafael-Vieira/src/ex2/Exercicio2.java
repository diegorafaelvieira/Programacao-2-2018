package ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class Exercicio2 {

	public static void main(String[] args) {
		
		ArrayList<MovimentosBancarios> movimentos = new ArrayList<MovimentosBancarios>();
		
		//leitura txt
		
		
		
		try {
			FileReader ler = new FileReader("Pasta/saldo.txt");
			BufferedReader br = new BufferedReader(ler);
			
			
			String valorI = null;
			String [] x;
			
			while ((valorI = br.readLine()) != null) {
				x = valorI.split(" ");
				
				for (int i = 0; i < x.length; i++) {
					 
					double saldoAtual = Double.parseDouble(x[0]);
					
					String descricao = br.readLine();
					
					//objeto
					movimentos.add(new MovimentosBancarios(saldoAtual, descricao));
				}
				
			}
			
			
			//fechar
			br.close();
			ler.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		

		//programa
		int opc = 0;
		double saldoAtual = 0;
		//double saldoI = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Saldo inicial R$ ");
		saldoAtual = scan.nextDouble();
		
		do {
			
			
			System.out.println("Menu");
			System.out.println("1 - Inserir movimento");
			System.out.println("2 - Listar movimentos");
			System.out.println("3 - Mostrar saldo");
			System.out.println("4 - Sair");
			System.out.print("Opção: ");
			try {
				opc = Integer.parseInt(scan.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("opção inválida.");
				//e.printStackTrace();
			}
		
		switch (opc) {
		case 1: // inserir movimento
			System.out.print("Insira um movimento R$: ");
			double valorM = scan.nextDouble();
			System.out.print("Insira a descrição do movimento: ");
			String descricaoM = scan.next();
			
			scan.nextLine();
			
			//objeto
			movimentos.add(new MovimentosBancarios(valorM, descricaoM));
			
			
			
			break;
			
		case 2: //listar movimentos
			System.out.println("Listagem de movimentos");
			for (int i = 0; i < movimentos.size(); i++) {
				System.out.println("Valor R$ " + movimentos.get(i).getValor());
				System.out.println("Descrição: " + movimentos.get(i).getDescricao());
				System.out.println();
			}

			break;
			
		case 3: //mostrar saldo conta
			
			for (int i = 0; i < movimentos.size(); i++) {
				
				 if (movimentos.get(i).getValor() > 0) {
				 saldoAtual = saldoAtual + movimentos.get(i).getValor();
				
				} else {
					saldoAtual = saldoAtual - movimentos.get(i).getValor();
				}
				
				System.out.println("Saldo R$" + saldoAtual);
			}
			
			
			break;
		
			
		case 4: // sair
			System.out.println("SAINDO...");
			break;
			
		}
		
		
		} while (opc != 4);
		
		
		scan.close();
		
		
		
		//salvar txt
		File arquivo = new File("Pasta/saldo.txt");
		
		try {
			arquivo.createNewFile();
			
			FileWriter escrever = new FileWriter(arquivo, false);  
			BufferedWriter bw = new BufferedWriter(escrever);
			
			for (int i = 0; i < movimentos.size(); i++) {
				bw.write((int) movimentos.get(i).getValor()+"\n");
				bw.write(movimentos.get(i).getDescricao()+"\n");
				System.out.println();
			}
			
			
			//fechar
			bw.close();
			escrever.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
