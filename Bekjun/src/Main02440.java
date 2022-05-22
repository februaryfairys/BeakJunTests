import java.util.Scanner;

public class Main02440 {
	static int number;
	static int line;
	static int star;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		sc.close();

		printLine();

	}

	static void printLine() {
		for (line = 1; line <= number; line++) {
			printStar();
			System.out.println();
		}
	}

	static void printStar() {
		for (star = number; star >= line; star--) {
			System.out.print("*");
		}
	}
}