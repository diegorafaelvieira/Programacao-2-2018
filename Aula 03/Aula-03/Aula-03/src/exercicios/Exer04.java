package exercicios;

public class Exer04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 9; i = i+2) {
			
			for (int j = 1; j <= 1000 ; j = j * 10) {
				
				System.out.print(i*j + " ");
			}
			
			System.out.println();
		}

	}

}
