package ex1;

import java.util.Scanner;

import ex1.pessoas.Governador;
import ex1.pessoas.Prefeito;
import ex1.pessoas.Presidente;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Cidade[] cidades = new Cidade[1];
		
		for (int i = 0; i < cidades.length; i++) {
			
			//PREFEITO
			System.out.print("Nome Prefeito: ");
			String nomePrefeito = scan.next();
			System.out.print("Partido Prefeito: ");
			String partidoPrefeito = scan.next();
			///Objeto Prefeito
			Prefeito pref = new Prefeito(nomePrefeito, partidoPrefeito);
			
			
			//GOVERNADOR
			System.out.print("Nome Governador: ");
			String nomeGovernador = scan.next();
			System.out.print("Partido Governador: ");
			String partidoGovernador = scan.next();
			//Objeto Governador
			Governador gov = new Governador(nomeGovernador, partidoGovernador);
					
			
			//PRESIDENTE
			System.out.print("Nome Presidente: ");
			String nomePresidente = scan.next();
			System.out.print("Partido Presidente: ");
			String partidoPresidente = scan.next();
			//Objeto Presidente
			Presidente pres = new Presidente(nomePresidente, partidoPresidente);
			
			//PAIS
			System.out.print("Nome Pais: ");
			String nomePais = scan.next();
			//Objeto Pais
			Pais patria = new Pais(pres, nomePais);
			
			//ESTADO
			System.out.print("Nome Estado: ");
			String nomeEstado = scan.next();
			System.out.print("Sigla Estado: ");
			String siglaEstado = scan.next();
			//Objeto Estado
			Estado est = new Estado(gov, patria, nomeEstado, siglaEstado);
			
			
			//CIDADE
			System.out.print("Nome cidade: ");
			String nomeCidade = scan.next();
			//Objeto Cidade
			cidades[i] = new Cidade(pref, est, nomeCidade);
		}
		
		System.out.println();
		
		//Impressão
		System.out.println("IMPRESSÃO");
		for (int j = 0; j < cidades.length; j++) {
			
			
			System.out.println("PREFEITO:" + cidades[j].getPrefeito().getNome());
			System.out.println("PARTIDO PREFEITO: " + cidades[j].getPrefeito().getPartido());
			System.out.println("NOME CIDADE: " + cidades[j].getNome());
			System.out.println("GOVERNADOR: " + cidades[j].getEstado().getGovernador().getNome());
			System.out.println("PARTIDO GOVERNADOR: " + cidades[j].getEstado().getGovernador().getPartido());
			System.out.println("NOME ESTADO: " + cidades[j].getEstado().getNome());
			System.out.println("SIGLA ESTADO: " + cidades[j].getEstado().getSigla());
	
			System.out.println("PRESIDENTE: " + cidades[j].getEstado().getGovernador().getNome()); /// procurar PRESIDENTE
			System.out.println("PARTIDO PRESIDENTE: " + cidades[j].getEstado().getGovernador().getPartido()); //procurar PRESIDENTE
			
		}
		
		scan.close();

	}

}
