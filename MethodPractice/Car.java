package Practice;

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	void Start() {
		if(gas!=0) {
			System.out.println("������ �ֽ��ϴ�. \n����մϴ�.");
		}
		else {
			System.out.println("gas�� �����ϴ�.\n�����������ϼ���.");
		}
	}
	
	void WhenStop() {
		for(int i=gas ; gas>=0;gas-=1) {
			if(gas>0) {
				System.out.println("�޸��ϴ�.(gas�ܷ�:"+gas+")");
			}
			else if(gas==0) {
				System.out.println("����ϴ�.(gas�ܷ�:"+gas+")");
				Start();
			}
		}
		
	}
}
