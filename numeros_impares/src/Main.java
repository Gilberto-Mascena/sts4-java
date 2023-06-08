import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * Contador de números pares com "do while".
		 */

		char resp;
		int x;

		do {
			System.out.print("Digite um número inteiro, para imprimir os números pares: ");
			x = sc.nextInt();
			for (int i = 0; i <= x; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
			System.out.print("Deseja continuar (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}
}
