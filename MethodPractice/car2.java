package Practice;

public class car2 {
	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLegtGas() {
		if(gas==0) {
			System.out.println("gas�� �����ϴ�.");
			return false;
		}
		
		else {
			System.out.println("gas�� �ֽ��ϴ�.");
			return true;
		}
	}

	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.gas�ܷ�("+gas+")");
				gas-=1;
			}
			else {
				System.out.println("����ϴ�.gas�ܷ�("+gas+")");
			return;
			}
		}
	}

}
