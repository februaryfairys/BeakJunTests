import java.util.Scanner;

public class Main10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int std = 0;
		int sum = 0;
		int[] ar = new int[5];

		for (std = 0; std < ar.length; std++) {

			int scr = sc.nextInt();
			if (scr < 40) {
				scr = 40;
			}
			sum += scr;

		}
//		System.out.println(sum);
//		System.out.println(std);
		System.out.println(sum / std);
		sc.close();
	}

}
