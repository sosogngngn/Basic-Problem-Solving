package Practice;
import java.util.Scanner;
public class Car2Example {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int i;
		car2 myCar = new car2();
		myCar.setGas(i=sc.nextInt());
		
		myCar.isLegtGas();
		boolean check=myCar.isLegtGas();
		if(check) {
			System.out.println("����մϴ�.");
			myCar.run();
		}
	
		if(check) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���");
		}
	}

}
