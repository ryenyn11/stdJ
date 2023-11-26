package s6btloopbreakcontinue;

import java.util.Scanner;

public class inraNgiathua {
	public static void main(String[]arg) {
// nhập vào số nguyên n, rồi in ra n!(for/while)
	// 3!=1*2*3
	Scanner sc = new Scanner(System.in);
	System.out.println("nhập n= ");
	int n = sc.nextInt();
	int gt=1;
	
	 for(int i=1; i<=n; i++) {
	  gt= gt * i; 
	  
	 }
	 System.out.println("n!= "+gt); 
	}
	/*int i=1;
	while(i<=n) {
		gt*=i;
		i++;
	}
	System.out.println("n!= "+gt);
	}*/
	
	}
