package study01;
//public 붙이면 안됨

//public 이나 main 메소드가 있는 클래스이름을 파일 이름으로 써야함. 아니면 에러
public class ArgsTest{
	
	public static void main(String[] args) {
		Args arg = new Args(); //arg:주소값이 들어있음.
		
		arg.x = 100; //class Args에 int x 값을 100으로 초기화
		//int arr1 = new arr1(); ->객체 생성 
		int[] arr = new int[1];// 배열 생성: int타입의 배열 1개
		      
		arg.add(arg.x);//arg.x = 100  -> Args 클래스에서 void add(int x) 가 실행됨
		System.out.println("arg.x = "+ arg.x);
		//class Args에 int x 값을 100으로 초기화 했으니 arg.x는 100
		
		arg.add(arg);//Args 클래스에서 void add(Args d) 가 실행됨 arg에는 주소가 들어감
		System.out.println("arg.x = "+ arg.x);
		//arg.x =140 why? Args 클래스의 add(Args c) 메소드에 들어감
		
		arg.addNew(arg);
		System.out.println("arg.x = "+ arg.x);//140
		
		arg.add(arr);//배열의 주소값을 갖고있다. 
		             //배열이 비어있으면 기본값은 0
		System.out.println("arr[0] = " + arr[0]);
		
		
		
	}
}
