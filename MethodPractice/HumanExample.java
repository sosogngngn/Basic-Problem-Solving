package Practice;

public class HumanExample {

	public static void main(String[] args) {
		Human gildong = new Human("길동",180,71);
		Human chursu = new Human("철수",183,72);
		
		gildong.increaseWeight(3);
		chursu.reduceWeight(2);
		
		System.out.println("이름:" + gildong.name);
		System.out.println("신장:"+ gildong.height);
		System.out.println("몸무게:"+ gildong.weight);
		System.out.println();
		System.out.println("이름:" + chursu.getName());
		System.out.println("신장:"+ chursu.getheight());
		System.out.println("몸무게:"+ chursu.getweight());		
		

	}

}

