package Practice;

public class Car3 {

	int speed;
	
	void getSpeed(int speed) {
		this.speed=speed;
	}
	
	void key() {
		System.out.println("Ű�� �����ϴ�.");
	}
	
	void run() {
		for(int i=10; speed>=i ; i+=10) {
			if(i<speed) {
				System.out.println("�޸��ϴ�.(�ü�:"+i+"km/h)");
			}
			else {
				System.out.println("�޸��ϴ�.(�ü�:"+i+"km/h)");
				System.out.println("���� �ӵ�:"+i+"km/h");
			}
		}
	}
}
