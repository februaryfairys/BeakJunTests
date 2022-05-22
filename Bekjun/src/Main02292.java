import java.util.Scanner;

public class Main02292 {
//벌집 통과 루트
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int i = 0;
		int sum = 1;
		sc.close();

		if (a <= 0) {
			i = 0;
		} else if (a > 0) {
			for (;;) {
				sum = sum + (i++ * 6);

				if (sum >= a) {
					break;
				}
			}
		}
		System.out.print(i);

	}
}
