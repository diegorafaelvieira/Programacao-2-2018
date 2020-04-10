package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double salario = 0;
		int somaColaborador = 0;
		int somaGeral = 0;
		double mediaGeral = 0;
		double mediaColaborador = 0;
		int qtdAbaixo = 0;
		double porc = 0;


		System.out.print("Informe o valor de M: ");
		int m = scan.nextInt();
		System.out.print("Informe o valor de N: ");
		int n = scan.nextInt();

		int[][] funcionariosSalarios = new int[m][n];

		for (int i = 0; i < funcionariosSalarios.length; i++) {
			
			
			for (int j = 0; j < funcionariosSalarios[i].length; j++) {

				System.out.println( "SALARIO R$" );
				salario = scan.nextDouble();
				somaColaborador += salario;
				somaGeral += somaColaborador;
				

				if (salario < mediaGeral) {
					qtdAbaixo ++;
					porc = qtdAbaixo*(funcionariosSalarios[i][j]/100);

					

				}
			}
			System.out.println();
		}
		//Impressão
		System.out.println("IMPRESSÃO"); 
		for (int i = 0; i < funcionariosSalarios.length; i++) {
			for (int j = 0; j < funcionariosSalarios[i].length; j++) {
				System.out.println(funcionariosSalarios[i][j] + "Salario colaborador  R$ " + salario);	 //1
			}
			mediaColaborador += salario / n;
			mediaGeral += mediaColaborador / m;
			
			
		}
		
		System.out.println("MEDIA COLABORADOR R$ " + mediaColaborador);
		System.out.println("MEDIA GERAL R$ " + mediaGeral);

		String t1 = String. format ("%2f",porc); 
		System.out.println("PORCENTAGEM ABAIXO DA MÉDIA " + t1 + " %");

		scan.close();

	}

}
