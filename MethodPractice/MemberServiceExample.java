package Practice;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemverService member =new MemverService();
	    boolean result=member.login("hong", "12345");
	    if(result) {
	    	System.out.println("�α��� �Ǿ����ϴ�.");
	    	member.logout("hong");
	    }
	    else {
	    	System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
	    	
	    }

	}

}
