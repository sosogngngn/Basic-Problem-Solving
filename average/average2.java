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
			System.out.print("2���� ������ �Է��ϼ���: ");
			x[i]= sc.nextInt();
		    y[i]= sc.nextInt();
		    
		    sum= x[i]+y[i];
		    avg= sum/(i+2);
		    
		    System.out.print("(" + x[i]+"," + y[i]+") �� ����?"+ sum);
		    System.out.println();
		    System.out.print("(" + x[i]+"," + y[i]+") �� �����?"+ avg);
		    System.out.println();
		   
		}
		System.out.println("���α׷��� �����մϴ�.");
	}
}
