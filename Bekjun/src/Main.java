import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		sc.close();

		String a1 = "";
		String a2 = "";
		String b1 = "";
		String b2 = "";
		String b3 = "";
		String result = "";
		int i, j;

		for (i = 0; i < iNum - 1; i++) {
			b1 += "  ";
		}

		for (i = 0; i < (iNum * 2) - 1; i++) {
			if (i < iNum) {
				a1 += "*";
				b2 = b1.substring(i * 2);
				result += a1 + b2 + a1 + "\n";
			} else {
				j = i - (iNum - 1);
				a2 = a1.substring(j);
				b3 += "  ";
				result += a2 + b3 + a2 + "\n";
			}
		}

		System.out.print(result);

//		String a = "*";
//		String b = "  ";
//		String result = "";
//		int i, j, k, l;
//		
//		for (i = 0; i < iNum; i++) {
//			for (j = 0; j <= i; j++) {
//				result += a;
//			}
//			for (k = 0; k < iNum - i - 1; k++) {
//				result += b;
//			}
//			for (l = 0; l <= i; l++) {
//				result += a;
//			}
//			result += "\n";
//		}
//
//		for (i = 0; i < iNum - 1; i++) {
//			for (j = 0; j < iNum - i - 1; j++) {
//				result += a;
//			}
//			for (k = 0; k <= i; k++) {
//				result += b;
//			}
//			for (l = 0; l < iNum - i - 1; l++) {
//				result += a;
//			}
//			result += "\n";
//		}
//		System.out.print(result);
	}
}
