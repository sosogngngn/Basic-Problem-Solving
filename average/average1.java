package average;
import java.util.Scanner;

public class average1 {

	public static void main(String[] args) {
		int x ;
		int y ;
		double sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x ���� �Է��ϼ��� : ");
		x= sc.nextInt();
		
		System.out.print("y ���� �Է��ϼ���: ");
		y= sc.nextInt();
		
		
		sum=x+y;
		avg= sum/2;
		
		System.out.println("x,y�� �� : " + sum);
		System.out.println("x,y�� ���: "+avg);	   		

	}

}
