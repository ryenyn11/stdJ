package s6btloopbreakcontinue;

import java.util.Scanner;

public class sochiahet3tu10den50 {

	public static void main(String[] args) {
		//int n=50;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập n= ");
		int n= sc.nextInt();
				
		for (int i=10; i<=n;i++) {
			if(i%3==0)
				System.out.print(i+" ");
			//System.out.println(i);
			else
				continue;
			
		}
	}

}
