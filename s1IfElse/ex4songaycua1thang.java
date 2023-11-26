package s1IfElse;

import java.util.Scanner;

public class ex4songaycua1thang {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int thang;
		System.out.println("Nhập tháng từ 1-12: ");
		thang= sc.nextInt();
		
		if(thang<1&& thang>12) {
			System.out.println("hãy nhập lại tháng hợp lệ");
		}
		else{
			if(thang==1||thang==3||thang==5||thang==7||thang==8||thang==10||thang==12) {
				System.out.println("tháng này có 31 ngày");
			}
			
			else if(thang==4||thang==6||thang==9||thang==11) {
				System.out.println("tháng này có 30 ngày");
			}
			else {
				int year;
				System.out.println("nhập năm: ");
				year= sc.nextInt();
				if(year%4==0 && year%100!=0 || year%400==0) {
					System.out.println("đây là năm nhuận nên tháng 2 có 29 ngày");
				}
				else { System.out.println("đây là năm không nhuận nên tháng 2 có 28 ngày");
				}
		
		    }
		}
	}

}
