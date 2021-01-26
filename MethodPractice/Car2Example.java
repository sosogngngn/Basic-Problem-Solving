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
			System.out.println("출발합니다.");
			myCar.run();
		}
	
		if(check) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요");
		}
	}

}
