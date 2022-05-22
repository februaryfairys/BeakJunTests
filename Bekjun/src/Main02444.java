import java.util.Scanner;

public class Main02444 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum = sc.nextInt();
		sc.close();
		
//		String a = "*";
//		String b = " ";
		
//		for (int i = 1; i <= iNum; i++) {
//			for (int j = iNum - 1; j >= i; j--) {
//				System.out.print(b);
//			}
//			for (int k = 1; k <= i * 2 - 1; k++) {
//				System.out.print(a);
//			}
//			System.out.println();
//			//다이아몬드 상단 출력
//		}
//		for (int i = 1; i <= iNum - 1; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(b);
//			}
//			for (int k = (iNum - 1) * 2 - i; k >= i; k--) {
//				System.out.print(a);
//			}
//			System.out.println();
//			//다이아몬드 하단 출력
//		}
//		System.out.println();
		
		
		String ast = "*";
		String blk = "";
		String blk_1;
		
		//다이아몬드 상단의 Asterisk와 Blank를 초기화함.
		//다이아몬드 상단, 하단의 Asterisk의 기준이 됨.
		
		String ast2;
		String blk2 = " ";
		//다이아몬드 하단의 Asterisk와 Blank를 담당하게 됨.
		for (int i = 1; i< iNum; i++){
			blk += " ";
		} 
		//초기화한 Blank를 기준에 맞게 재가공함.
		
		for (int i = 1; i <= iNum; i++) {
			blk_1 = blk.substring(i - 1);
			//초기화 한 Blank를 기준으로 일정 수치만큼 잘라서 출력.
			System.out.println(blk_1 +ast);
			ast += "**";
			//초기화 한 Asterisk를 기준으로 재선언.
		}
		//다이아몬드 상단 출력
		
		for (int i = 1; i <= iNum - 1; i++) {
			ast2 = ast.substring(i * 2 - 1, (iNum*2)-2);
			//재선언 되어 저장된 Asterisk를 일정 수치만큼 잘라서 출력.
			System.out.println(blk2 + ast2);
			blk2 += " ";
			//초기화한 Blank를 기준으로 재선언.
		}
		//다이아몬드 하단 출력
	}
}
