package study01;
//CPU - RAM - SSD
//     Java(JVM: 교재 140): method Area: 공유 영역(static 영역)
//                         stack Area: 변수저장
//                         Heap Area : 객체생성 저장
public class VariableKind {
	
	int memVar;
	//인스턴스 변수 -> 메인에서 객체가 생성되어야만 쓸수있음 RAM에 없으니까.
	
 	static int staticVar;
 	//static 변수로 이미 RAM에 있는 상태 그러므로 객체생성을 하지 않아도 사용 가능
	//메소드 영역
 	
public static void main(String[] args) { 
	    //로컬변수
	    int localVar=0; //stack 영역	
        	
		VariableKind vk1 = new VariableKind(); //heap 영역 
		// 램에 class VariableKind를 올려놓음
		System.out.println("vk1.memVar = "+ vk1.memVar); //0 출력
		vk1.memVar = 100;
		System.out.println("vk1.memVar = "+ vk1.memVar); //100 출력
		System.out.println("vk1.staticVar = " + vk1.staticVar);//0출력
		System.out.println("VariableKind.staticVar = " + VariableKind.staticVar);// 굳이 이럴필요 없다 왜냐? staticVar 는 static 변수기 때문이다.
		System.out.println("staticVar = "+ staticVar);//static 이므로 vk1을 호출할 필요가 없다.
	    
		
		VariableKind vk2 = new VariableKind();
	    vk2.staticVar = 20;	
	    System.out.println("vk2.staticVar= " + vk2.staticVar);
	    System.out.println("vk2.memVar= " + vk2.memVar);
	    vk2.memVar = 300;
	    System.out.println("vk2.memVar= " + vk2.memVar);//300
	    // System.out.println("localVar = "+ localVar);// -> localVar는 메인함수에 있는
	    
	    System.out.println("-------------------------------");
	    System.out.println(localVar);
	    System.out.println(vk1.memVar);
	    System.out.println(staticVar);
	    System.out.println(vk1.staticVar);
	    //지역변수이므로 반드시 초기화를 해주어야한다. 인스턴스 스테틱 변수는 초기화를 하지 않아도 기본값으로 0을 갖고
	    //있다.

	}
   //클래스 안에 있는 모든 변수를 '멤버변수'라고 함. ->근데 책마다 이를 지칭하는게 다 다름

	
	

}
