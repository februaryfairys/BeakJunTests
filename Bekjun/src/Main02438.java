
import java.util.Scanner;

public class Main02438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		for (int line = 1; line <= number; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
