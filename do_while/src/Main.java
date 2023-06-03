import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * Fórmula que calcula Celsius para Fahrenheit com "do while".
		 * 
		 * Estrutura repetitiva "faça-enquanto".
		 * 
		 * do {
		 * 		comando 1
		 *      comando 2
		 * } while ( condição);
		 * 
		 * O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
		 * Regra: verdadeiro volta, falso pula fora.
		 */

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		do {
			System.out.print("Digite a temperatura em celcius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}
}
