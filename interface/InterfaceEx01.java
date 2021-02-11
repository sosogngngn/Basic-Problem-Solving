package study08_interface2;
import java.util.Scanner;
public class InterfaceEx01 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		SeperateVolume obj1 = new SeperateVolume("86738", "개미", "베르베르");
		AppCDInfo obj2 = new AppCDInfo("2018-9001", "Spring");
		
		System.out.print("대여할 수 있는지 알려면 0을 눌러주세요:");
		byte judge = sc.nextByte();
		
		
		try {
		obj1.checkOut("홍길여","20180611",judge);
		}
		catch(Exception e) {
			String message = e.getMessage();
			System.out.println(message);
			
		}
		try {
		obj2.checkOut("박삼수","20180319",judge);
		}
		catch(Exception e) {
		   String message=e.getMessage();
		   System.out.println(message);
		 
		}
		obj1.checkIn(judge);
		obj2.checkIn(judge);
		

	}

}
