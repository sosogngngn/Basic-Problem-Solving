package Inheritage_polymorphism;

public class Car {
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double fuel;

	public Car(String name, int width, int height, int length,double fuel) {
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
	}

	
    double getX() {  //현재 위치의 x좌표 불러오기
		return x;   
	}
	double getY() {  //현재 위치의 y좌표 불러오기
		return y;
	}
	double getFuel() {//남은 연료 불러오기
		return fuel;
	}
	
	void putSpec() {
		System.out.println("이름: "+ this.name);
		System.out.println("전폭: "+ this.width+"mm");
		System.out.println("전고: "+ this.height+"mm");
		System.out.println("전장: "+ this.length+"mm");
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx+dy*dy);//이동거리
		
	
		if(dist>fuel)//이동할 수 없다. 
		return false;
		
		else {
			fuel-=dist;  //이동거리만큼 연료가 준다.
		x+=dx;
		y+=dy;
		return true;   //이동완료
		}
		
	}
	
	

}



