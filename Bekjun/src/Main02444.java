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
//			//���̾Ƹ�� ��� ���
//		}
//		for (int i = 1; i <= iNum - 1; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print(b);
//			}
//			for (int k = (iNum - 1) * 2 - i; k >= i; k--) {
//				System.out.print(a);
//			}
//			System.out.println();
//			//���̾Ƹ�� �ϴ� ���
//		}
//		System.out.println();
		
		
		String ast = "*";
		String blk = "";
		String blk_1;
		
		//���̾Ƹ�� ����� Asterisk�� Blank�� �ʱ�ȭ��.
		//���̾Ƹ�� ���, �ϴ��� Asterisk�� ������ ��.
		
		String ast2;
		String blk2 = " ";
		//���̾Ƹ�� �ϴ��� Asterisk�� Blank�� ����ϰ� ��.
		for (int i = 1; i< iNum; i++){
			blk += " ";
		} 
		//�ʱ�ȭ�� Blank�� ���ؿ� �°� �簡����.
		
		for (int i = 1; i <= iNum; i++) {
			blk_1 = blk.substring(i - 1);
			//�ʱ�ȭ �� Blank�� �������� ���� ��ġ��ŭ �߶� ���.
			System.out.println(blk_1 +ast);
			ast += "**";
			//�ʱ�ȭ �� Asterisk�� �������� �缱��.
		}
		//���̾Ƹ�� ��� ���
		
		for (int i = 1; i <= iNum - 1; i++) {
			ast2 = ast.substring(i * 2 - 1, (iNum*2)-2);
			//�缱�� �Ǿ� ����� Asterisk�� ���� ��ġ��ŭ �߶� ���.
			System.out.println(blk2 + ast2);
			blk2 += " ";
			//�ʱ�ȭ�� Blank�� �������� �缱��.
		}
		//���̾Ƹ�� �ϴ� ���
	}
}
