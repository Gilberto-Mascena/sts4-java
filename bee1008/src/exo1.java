import java.util.Locale;
import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroDoTrabalhador = sc.nextInt();
		int numeroDeHoras = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		
		System.out.println("NUMBER = " + numeroDoTrabalhador);
		
		double salario = numeroDeHoras * valorPorHora;
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}
}
