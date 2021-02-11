package Inheritage_polymorphism;

public class ExCar extends Car {
	
	private double totalMilege; // 총 주행거리
	ExCar(String name, int width, int height, int length,double fuel){
	   super(name,width,height,length,fuel);
	   totalMilege=0.0;
	}
	
	public double getTotalMilege() {
		return totalMilege;
	}
	public void putSpec() {
		super.putSpec(); //부모의 메소드를 그대로 쓰겠다. 오버라이드 중에
		System.out.println("총 주행거리: "+totalMilege+"km");
	}
	
	boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy);
		if(!super.move(dx,dy))
			return false;
		else {
			totalMilege+=dist;
			return true;
		}
	}

}
