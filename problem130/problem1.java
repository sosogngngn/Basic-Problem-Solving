package problem130;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ΰ��� ������ �Է��ϼ���");
		System.out.print("A:");
		int a = sc.nextInt();
		System.out.print("B:");
		int b = sc.nextInt();
		
		if(a%b==0) {
			System.out.println(b+ "��"+ a + "�� ����̴�.");
		}
		
		else {
			System.out.println(b+ "��"+ a + "�� ����� �ƴϴ�.");
		}
	}

}
