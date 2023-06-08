import java.util.Locale;
import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Programa que calcula o IMC.
		 */

		char resp;
		do {
			System.out.print("Digite seu peso: ");
			double peso = sc.nextDouble();
			System.out.print("Digite sua altura: ");
			double altura = sc.nextDouble();

			double IMC = peso / (altura * altura);
			if (IMC < 18.5) {
				System.out.printf(
						"Seu IMC é de: %.1f kg/m2.%nMAGREZA, de acordo com a OMS, "
								+ "seu IMC está abaixo do peso para a sua altura. "
								+ "Para atingir um valor de IMC normal, seu peso deve estar entre 59.9 e 80.7 kg. ",
						IMC);
			} else if (IMC < 24.9) {
				System.out.printf(
						"Seu IMC é de: %.1f kg/m2.%nNORMAL, de acordo com a OMS, "
								+ "seu IMC está recomendado para a sua altura. "
								,IMC);
			} else if (IMC < 30.0) {
				System.out.printf("Seu IMC é de: %.1f kg/m2.%nSOBREPESO, de acordo com a OMS, "
								+ "seu IMC está acima do recomendado para a sua altura. "
								+ "Para atingir um valor de IMC normal, seu peso deve estar entre 59.9 e 80.7 kg. ",
						IMC);
			} else {
				System.out.printf("Seu IMC é de: %.1f kg/m2.%nOBESIDADE, de acordo com a OMS, "
								+ "seu IMC está muito acima do recomendado para a sua altura. "
								+ "Para atingir um valor de IMC normal, seu peso deve estar entre 59.9 e 80.7 kg. ",
						IMC);
			}
			
			System.out.println();
			System.out.print("Deseja calcular de novo (s/n)? ");

			resp = sc.next().charAt(0);
		} while (resp != 'n');

		sc.close();
	}
}
