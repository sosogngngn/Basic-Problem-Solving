package average;
import java.util.Scanner;

public class average1 {

	public static void main(String[] args) {
		int x ;
		int y ;
		double sum;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값을 입력하세요 : ");
		x= sc.nextInt();
		
		System.out.print("y 값을 입력하세요: ");
		y= sc.nextInt();
		
		
		sum=x+y;
		avg= sum/2;
		
		System.out.println("x,y의 합 : " + sum);
		System.out.println("x,y의 평균: "+avg);	   		

	}

}
