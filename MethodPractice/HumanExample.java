package Practice;

public class HumanExample {

	public static void main(String[] args) {
		Human gildong = new Human("�浿",180,71);
		Human chursu = new Human("ö��",183,72);
		
		gildong.increaseWeight(3);
		chursu.reduceWeight(2);
		
		System.out.println("�̸�:" + gildong.name);
		System.out.println("����:"+ gildong.height);
		System.out.println("������:"+ gildong.weight);
		System.out.println();
		System.out.println("�̸�:" + chursu.getName());
		System.out.println("����:"+ chursu.getheight());
		System.out.println("������:"+ chursu.getweight());		
		

	}

}

