package s6btloopbreakcontinue;

import java.util.Scanner;

public class tonggiaithua {

	public static void main(String[] args) {
		//tính tổng 1!+2!+..+10!
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("nhập n= ");
		int n= sc.nextInt();*/
		int tong=0, gt=1;
		for(int i=1;i<=10;i++) {
			gt*=i;
			tong+=gt;
		}
		System.out.println(tong);

	}

}
