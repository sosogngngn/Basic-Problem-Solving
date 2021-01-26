package Practice;

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	void Start() {
		if(gas!=0) {
			System.out.println("가스가 있습니다. \n출발합니다.");
		}
		else {
			System.out.println("gas가 없습니다.\n가스를주입하세요.");
		}
	}
	
	void WhenStop() {
		for(int i=gas ; gas>=0;gas-=1) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:"+gas+")");
			}
			else if(gas==0) {
				System.out.println("멈춥니다.(gas잔량:"+gas+")");
				Start();
			}
		}
		
	}
}
