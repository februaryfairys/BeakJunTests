import java.util.Scanner;

public class Main01193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int line = 1;
		int sum = 0;
		while (true) {
			if (num <= line + sum) {
				if (line % 2 == 0) {
					System.out.println((num - sum) + "/" + (line + sum - num + 1));
					break;
				} else {
					System.out.println((line + sum - num + 1) + "/" + (num - sum));
					break;
				}
			} else
				sum += line;
				line++;
		}
		sc.close();
	}
}
