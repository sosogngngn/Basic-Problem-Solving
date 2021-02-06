package Test;
//배열을 이용해 이렇게 출력되도록 하세요
//(풍산개, 풍산)
//(진도개, 진도)
//(워리, 블독)
public class Dog {
	String name; // 풍산개 진도개 워리
	String kind; // 풍산   진도  블독

	Dog(String name, String kind){
		this.name = name;
		this.kind = kind;
	}
	
	@Override//toString() override dog 형식에 맞게
	public String toString() {
		return name + ":::" + kind;
	}
}
