import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M, N;

		M = sc.nextInt();
		N = sc.nextInt();

		String[][] mat = new String[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.next();
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
