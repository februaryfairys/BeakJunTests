import java.util.Scanner;

public class Main09498 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int scr = a / 10;
		String[] grd = { "A", "B", "C", "D", "F" };
		sc.close();

		switch (scr) {
		case 10:
			System.out.print(grd[0]);
			break;
		case 9:
			System.out.print(grd[0]);
			break;
		case 8:
			System.out.print(grd[1]);
			break;
		case 7:
			System.out.print(grd[2]);
			break;
		case 6:
			System.out.print(grd[3]);
			break;
		default:
			System.out.print(grd[4]);
			break;
		}

	}
}
