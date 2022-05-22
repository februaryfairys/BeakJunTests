import java.util.Arrays;
import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();

//		int min = 1000000;
//		int max = -1000000;
//
//		for (int i = 0; i < iNum; i++) {
//			int iNum2 = sc.nextInt();
//			min = iNum2 <= min ? iNum2 : min;
//			max = iNum2 >= max ? iNum2 : max;
//		}
//		System.out.print(min + " " + max);

//		int[] ar = new int[iNum];
//		for (int i = 0; i < iNum; i++) {
//			int iNum2 = sc.nextInt();
//			ar[i] = iNum2;
//		}
//
//		sc.close();
//
//		Arrays.sort(ar);
//		System.out.print(ar[0] + " " + ar[iNum - 1]);

		int[] ar = new int[iNum];
		int min = ar[0], max = ar[0];
		for (int i = 0; i < iNum; i++) {
			ar[i] = sc.nextInt();
			if (ar[i] <= min) {
				min = ar[i];
			} else if (ar[i] >= max) {
				max = ar[i];
			}
		}

		sc.close();
		System.out.print(min + " " + max);
	}
}