package study01;

public class VariableArgument {
    //JDK 1.5에서 인자의 개수를 가변적으로 받을 수 있는 방식이 추가됨.
    //가변적으로 넘어온 인자들은 배열 타입으로 받아진다.

	void printInfo(String... infos) {//호출당하는 놈은 parameter
		                             //String[] infos 는 안됨 왜?
		                             //인자의 개수를 가변적으로 받을 때 배열로 받고 ...으로 씀
		if(infos.length != 0) {
			for(int i=0 ; i<infos.length ; i++) {
				System.out.println(infos[i]);
			}
		}
		else {
			System.out.println("인자가 없네요.");
		}
	}
//메소드 오버로딩--------------------------------------------------------- 같은이름을 가진 메소드로 파라미터의 타입이 같아야 하고 타입의 갯수, 순서가 달라야함
/*	void printInfo() {System.out.println("인자가 없네요");	}
	
	void printInfo(String name1) { 
		System.out.println(name1);    
		}
	
	void printInfo(String name1, String name2) { 
		System.out.println(name1+", " + name2);     
		}
	//void printInfo(String name2, String name1) {     --> 오류(같은이름을 가진 메소드로 파라미터의 타입이 같아야 하고 타입의 갯수, 순서가 달라야함)

	
	void printInfo(String name1, String name2, String name3) { 
		System.out.println(name1+", " + name2 + ", " + name3);   
		}
	//메소드 오버로딩---------------------------------------------------------
	*/
	public static void main(String[] args) {
		VariableArgument vt = new VariableArgument();
		System.out.println("인자 없이");
		vt.printInfo();
		System.out.println();
		System.out.println("인자 하나");
		vt.printInfo("홍길동");//호출하는놈이 Argument
		System.out.println();
        System.out.println("인자 두개");
		vt.printInfo("홍길동","직업능력개발");
		System.out.println();
		System.out.println("인자 세 개");
		vt.printInfo("홍길동","직업능력개발","1억");
		
	}
	
	}



