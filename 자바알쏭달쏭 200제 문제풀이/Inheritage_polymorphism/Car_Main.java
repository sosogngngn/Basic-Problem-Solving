package Inheritage_polymorphism;

public class Car_Main {

	public static void main(String[] args) {
		ExCar x = new ExCar("람보르기니",50,20,5,100);
		x.putSpec();
		x.move(0,0);
		x.getTotalMilege();

	}

}
