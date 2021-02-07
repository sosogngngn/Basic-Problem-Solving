package study01;
//자바는 대소문자 구분
//class
public class Aircon {
	//수학 : a=10
	//컴퓨터 : a==10;
	int a = 10;
    //1.변수 정의
	String company;
	String color;
	int price;
	int size;
	int temp;
	//2.메소드 정의
	void powerOn() {
		System.out.println("power on");
	}
	
	void powerOff() {
		System.out.println("power off");
	}
	
	void tempUp() {
		temp++;
	}
	
	void tempDown() {
		temp--;
	}
	
	//3.생성자
	//4.초기화 블럭

}
