import java.util.Scanner;

public class Bee1067 {	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Contador de números ímpares
		 */
		System.out.print("Digite um número inteiro para imprimir os ímpares: ");
		int x = sc.nextInt();
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
				
		sc.close();
		
	}
}
