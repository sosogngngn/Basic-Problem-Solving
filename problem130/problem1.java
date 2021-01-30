package problem130;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 정수를 입력하세요");
		System.out.print("A:");
		int a = sc.nextInt();
		System.out.print("B:");
		int b = sc.nextInt();
		
		if(a%b==0) {
			System.out.println(b+ "는"+ a + "의 약수이다.");
		}
		
		else {
			System.out.println(b+ "는"+ a + "의 약수가 아니다.");
		}
	}

}
