package Test;

public class ArrayDog {

	public static void main(String[] args) {
		 Dog[] dg = new Dog[3];
		 dg[0]= new Dog("풍산개","풍산");
 		 dg[1]= new Dog("진도개","진도");
		 dg[2]= new Dog("워리","블독");
		 //Dog 타입 배열 [           ] [            ] [           ] 3개가 만들어짐
         //여기안에      ["풍산개","풍산"] ["진도개","진도"] ["워리","블독"] 객체가 들어가 있는거임.
		 //그니까 강아지 집주인(클래스) 가 집을 여러개 만들었음(배열) 여기에 철수,영희 강아지(객체)를 한집에
		 //영철,대찬 강아지를 한집에 넣었다고 보면됨
		 for(int i=0 ; i<dg.length;i++) {
			 System.out.println("("+dg[i].name+", "+dg[i].kind+")");
		 }
		 System.out.println();
		 
		 for(Dog d : dg) {
			 System.out.println("("+d.name+", "+d.kind+")");
			System.out.println(d);
		 }
		 
         System.out.println(dg);// //이건 특정한 위치를 가르키고 있지않음. 그래서 주소값이 나오는거임.
		 System.out.println(dg[0]);//특정한 위치를 가르키고 있어야함
		 
		 		 

	}

}
