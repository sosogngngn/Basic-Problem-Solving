//����
//while���� Math.ramdom() �޼ҵ带 �̿��ؼ� �� ���� �ֻ����� ������ �� ������ ���� (��1,��2) ���·� ����ϰ�, ���� ���� 5�� �ƴϸ� ��� �ֻ����� ������, ���� ���� 5�̸�
//������ ���ߴ� �ڵ带 �ۼ��غ�����. ���� ���� 5�� �Ǵ� ������ (1,4),(4,1),(2,3),(3,2) �Դϴ�.

package whileFor;

public class problem1 {

	public static void main(String[] args) {
		int num1= (int)((Math.random())*6+1) ;
		int num2= (int)((Math.random())*6+1) ;
		
		while(num1+num2!=5)
		{
			System.out.println("("+num1+","+ num2+")");
			num1= (int)((Math.random())*6+1) ;
			num2= (int)((Math.random())*6+1) ;
			
		}
		    System.out.println("("+num1+","+ num2+")");
		}

	}