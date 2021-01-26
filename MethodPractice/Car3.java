package Practice;

public class Car3 {

	int speed;
	
	void getSpeed(int speed) {
		this.speed=speed;
	}
	
	void key() {
		System.out.println("키를 돌립니다.");
	}
	
	void run() {
		for(int i=10; speed>=i ; i+=10) {
			if(i<speed) {
				System.out.println("달립니다.(시속:"+i+"km/h)");
			}
			else {
				System.out.println("달립니다.(시속:"+i+"km/h)");
				System.out.println("현재 속도:"+i+"km/h");
			}
		}
	}
}
