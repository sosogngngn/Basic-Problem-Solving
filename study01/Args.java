package study01;

class Args {
	int x;//100 140
	
	
	//method 오버로딩
	//add(int x)의 x: parameter, local 변수
	void add(int x) {
		//tihs.x=(x+50); 이렇게 하면 
		//arg.add(arg.x) 수행후 arg.x 가 150으로 변함
		x=x+50; //-> x는 지역변수로 여기에서만 쓰임 필드로 전달x
		
	}
	
	void add(Args c) { //파라미터 변수면서 참조변수가 되는거임 d에는 클래스 덩어리가 날라옴 즉, arg는 Args 클래스의 주소를 갖고있다.
		//그니까 이 add는 주소값을 변수로 받겠다라는 것임. Args 의 주소값만 받겠단 말!
		//Args c Args타입의 인자를 받겠다. int a 가 정수형 타입 인자를 받겠다라는 뜻과 동일함	                
		//arg.x = 100이 들어 있음.
		c.x=c.x+40;
	}

	void add(int[] arr) {//배열을 parameter로 받겠다.
		//arr[0]++ -> 이건 출력이고 뭐고 없으니까 그냥 1임.
		System.out.println("method[]="+arr[0]++); //출력 후에 1을 올려라! 그니까 출력은 0으로 나옴
		//++arr[0];
	}
//-----------------------------------------------------	
	//arg.x =140인 상태
	void addNew(Args d) {
		d = new Args(); //Args 타입의 변수 d 를 받은거니까
	//결국 이놈은 Args d = new Args(); 랑 같은거임.
	//arg.x=140인상태에서 새로운 객체를 생성했으니 arg.x가 140이 된거임.
	}

}

