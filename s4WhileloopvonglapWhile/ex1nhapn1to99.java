package s4WhileloopvonglapWhile;

import java.util.Scanner;

public class ex1nhapn1to99 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("mời bạn nhập vào 1 số từ 1-99: ");
		int n=sc.nextInt();
		while (n<1 || n>99) {
			System.out.println("đã bảo nhập từ 1-99 mừ,nhập lại đii");
			n=sc.nextInt();  //cập nhật n
		}
		System.out.println("bạn đã nhập n= "+n);

	}

}
