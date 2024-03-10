import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b;

		a = sc.nextDouble();
		b = sc.nextDouble();
		if (a > b) {
			System.out.printf("O maior é: %.2f%n", a);
		} else {
			System.out.printf("O maior é: %.2f%n", b);
		}

		sc.close();
	}
}
