import java.util.Locale;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char resp;
		
		do {

			int N = sc.nextInt();

			String[] nome = new String[N];
			int[] idade = new int[N];
			double[] altura = new double[N];

			for (int i = 0; i < N; i++) {
				nome[i] = sc.next();
				idade[i] = sc.nextInt();
				altura[i] = sc.nextDouble();
			}

			double soma = 0.0;
			for (int i = 0; i < N; i++) {
				soma += idade[i];
			}

			double media = soma / N;
			System.out.printf("A média das idade é: %.2f%n", media);

			int cont = 0;
			for (int i = 0; i < N; i++) {
				if (idade[i] < 15) {
					cont++;
				}
			}

			double x = cont * 100.0 / N;
			System.out.printf("Pessoas com menos de 15 anos %.1f%%%n", x);

			System.out.println();
			System.out.println("Deseja continuar (s/n)? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');

		sc.close();
	}
}
