package s2toantu3ngoi;

import java.util.Scanner;

public class tt3ngoi {
	public static void main(String[]args) {
		//cú pháp khai báo biến=(bthuc 1) ? bthuc 2:bthuc 3;
		//ex
		Scanner sc= new Scanner(System.in);
		//ktra chãnư lẻ
		System.out.println("nhập 1 số: ");
		int n= sc.nextInt();
		String num = (n%2==0) ? "đây là số chẵn" : "đây là số lẽ"; //gán thêm 1 biên skhacs
		System.out.println(num);
	}

}
