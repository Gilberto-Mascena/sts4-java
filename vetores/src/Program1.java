import java.util.Locale;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String[] sv = new String[n];
		sc.nextLine();
		for (int i = 0; i < n; i++) {	
			sv[i] = sc.nextLine();			
		}
		for (int i = 0; i < n; i++) {
			System.out.println(sv[i]);
		}
		System.out.print(sv[0].equals(sv[1]));

		sc.close();
	}
}
