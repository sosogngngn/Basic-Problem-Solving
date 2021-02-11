package study08_interface2;

public class AppCDInfo extends CDInfo implements Lendable {
	String borrower;//대출인
	String checkOutDate;//대출일
	byte state;//대출상태
	
	public AppCDInfo(String registerNo, String title){//"2018-9001", "Spring"
		super(registerNo,title);
	}

	@Override
	public void checkOut(String borrower, String date, byte state)throws Exception {
		
		if(state==0) {
			throw new Exception("이미 대출되어 대여할 수없습니다..");
		}
			else {
		System.out.println("*"+title+"이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:"+date);
		System.out.println();
		}
	}
		
	

	@Override
	public void checkIn(byte state) {
		if(state==0) {
		 
		}
		else
		System.out.println(title+"이(가) 반납되었습니다.");
		System.out.println();
	}

}

