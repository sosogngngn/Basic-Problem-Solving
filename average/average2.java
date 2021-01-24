package average;

import java.util.Scanner;
public class average2 {

	public static void main(String[] args) {
		int [] x = new int[5];
		int [] y = new int[5];
		double sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0 ; i<x.length ; i++)
		{ 
			System.out.print("2개의 정수를 입력하세요: ");
			x[i]= sc.nextInt();
		    y[i]= sc.nextInt();
		    
		    sum= x[i]+y[i];
		    avg= sum/(i+2);
		    
		    System.out.print("(" + x[i]+"," + y[i]+") 의 합은?"+ sum);
		    System.out.println();
		    System.out.print("(" + x[i]+"," + y[i]+") 의 평균은?"+ avg);
		    System.out.println();
		   
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
