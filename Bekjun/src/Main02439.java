import java.util.Scanner;

public class Main02439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int line = 1; line <= num; line++) {
			for (int blank = num - 1; blank >= line; blank--)
				System.out.print(" ");
			for (int star = 1; star <= line; star++) {
				System.out.printf("%c", '*');
			}
			System.out.println();
		}
	}

}
