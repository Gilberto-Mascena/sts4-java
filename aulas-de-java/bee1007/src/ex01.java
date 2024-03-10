import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();

		int x = A * B;
		int y = D * C;

		int dif = x - y;
		System.out.println("DIFERENCA = " + dif);

		sc.close();
	}
}
