import java.util.Scanner;

public class Main02443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		for (int i = 1; i <= n; i++) {
			for (int b = 0; b<i-1;b++){
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*n-(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
