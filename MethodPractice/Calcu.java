package Practice;

public class Calcu {

	void Poweron() {
		 System.out.println("전원을 켭니다.");
	}
	
	int plus (int x, int y) {
		int sum=x+y;
		return sum;
	}
	
	double avg (int x, int y) {
		double result = plus(x,y)/2;
		return result;
	}
	
	void println(String message) {
		System.out.println(message);
	}
	
	void action() {
		println("result1= "+plus(5,6));
		println("result2= "+avg(5,6));
	}
	void Poweroff() {
		System.out.println("전원을 끕니다.");
	}
}
