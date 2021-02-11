package study08_interface2;

public class SeperateVolume implements Lendable {
	String requestNo;//청구번호
	String bookTitle;//제목
	String writer;//저자
	String borrower;//대출인
	String checkOutDate;//대출일
	byte state;//대출상태
	
	SeperateVolume(String requestNo, String bookTitle, String writer){
		this.requestNo=requestNo;
		this.bookTitle=bookTitle;
		this.writer=writer;
	}
	
	//인터페이스의 메소드를 구현시 반드시 public
	public void checkOut(String borrower, String date, byte state) throws Exception{
		this.borrower = borrower;
		this.checkOutDate=date;
		this.state=state;
		
        if(state==0) 
            throw new Exception("이미 대출되어 대여할 수 없습니다.");    
		System.out.println("*"+bookTitle+"이(가) 대출되었습니다.");
		System.out.println("대출인:" + borrower);
		System.out.println("대출일:"+date);
		System.out.println();
	}
	
	//인터페이스의 메소드를 구현시 반듯 public
	public void checkIn(byte state) {
		if(state==0) {
		 
		}
		else
		System.out.println(bookTitle+"이(가) 반납되었습니다.");
		System.out.println();
	}

}
