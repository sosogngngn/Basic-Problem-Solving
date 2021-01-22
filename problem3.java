/* 문제) for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요
 * *
 * **
 * ***
 * ****
 * *****
 * */

package whileFor;

public class problem3 {

	public static void main(String[] args) {
				int i ;
				int j ;
				for(i=1; i <6 ; i++) {
					for(j=1; j<=i ; j++) {
						System.out.print("*");
					}
					System.out.println(" ");
				}
	}
}