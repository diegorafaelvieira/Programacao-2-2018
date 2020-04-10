package exercicios;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o 1° valor: ");
		double v1 = scan.nextDouble();

		System.out.print("Digite o 2° valor: ");
		double v2 = scan.nextDouble();
		
		
		System.out.println("Valor absoluto v1 = "+ Math.abs(v1)); // Valor absoluto
		System.out.println("Valor absoluto v2 = "+ Math.abs(v2)); // Valor absoluto
		System.out.println("Arredonda para cima v1 = "+ Math.ceil(v1)); // Arredonda para cima
		System.out.println("Arredonda para cima v2 = "+ Math.ceil(v2)); // Arredonda para cima
		System.out.println("Arredonda para baixo v1 = "+ Math.floor(v1)); // Arredonda para baixo
		System.out.println("Arredonda para baixo v2 = "+ Math.floor(v2)); // Arredonda para baixo
		System.out.println("Retorna o maior valor = "+ Math.max(v1,v2)); // Retorna o maior
		System.out.println("Retorna o menor valor =  "+ Math.min(v1,v2)); // Retorna o menor
		System.out.println("Potência de v1 elevado a v2 = "+ Math.pow(v1,v2)); // Potencia: x elevado a y
		System.out.println("Raiz quadrada de v1 = "+ Math.sqrt(v1)); // Raiz quadrada
		System.out.println("Raiz quadrada de v2 = "+Math.sqrt(v2)); // Raiz quadrada
		
		
		scan.close();
	}

}
