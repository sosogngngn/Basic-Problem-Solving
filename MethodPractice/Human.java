package Practice;

public class Human {
	
    String name;  //private�� getName() ���� ȣ���ؾ���.
	int height;
	int weight;
	
	Human(String name, int height, int weight){
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	
	String getName() {
		return name;
	}
	
	int getheight() {
		return height;
	}
	
	int getweight() {
		return weight;
	}
	
	void increaseWeight(int w) {
		weight+=w;
	}
	
	void reduceWeight(int w) {
		 weight-=w;
	}
	}

