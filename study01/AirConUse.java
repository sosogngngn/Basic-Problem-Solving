package study01;
//CPU - RAM - SSD
public class AirConUse {
	//main() : 프로그램의 시작
	public static void main(String[] args) {
        //객체생성
		Aircon airCon = new Aircon();
		
		//변수사용
		airCon.color = "white";
		airCon.temp = 10;
		airCon.price=10000;
		airCon.tempUp();
		System.out.println("airCon.temp = "+airCon.temp+ "airCon.color = "+ airCon.color+"," +"airCon.pric = " + airCon.price + "원" );

		airCon.powerOn();
		airCon.powerOff();
		airCon.tempDown();
		System.out.println("airCon.temp = " + airCon.temp + ", airCon.color = " + airCon.color
				+ ", airCon.price = " + airCon.price + "원 ");
	}

}
