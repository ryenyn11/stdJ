package s1IfElse;

import java.util.Scanner;

public class ex3namnhuan {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	    double year;
	    System.out.println("mời bạn nhập năm: ");
	    year = sc.nextDouble();
	    if(year%4==0 && year%100 !=0 || year%400==0) {
	    	System.out.println(year+" là năm nhuận");
	    }
	    else {
	    	System.out.println(year+" không là năm nhuận");
	    }
	}

}
