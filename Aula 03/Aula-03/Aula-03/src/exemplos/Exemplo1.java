package exemplos;

public class Exemplo1 {

	public static void main(String[] args) {


		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				break; 
			}
			System.out.print(i + " ");
		}
		System.out.println("Saiu!");




		for (int i = 0; i < 10; i++) {

			if (i == 5) {
				continue; 
			}
			System.out.print(i + " ");
		}
		System.out.println("Saiu!");

	}

}
