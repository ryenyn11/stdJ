package s1IfElse;

import java.util.Scanner;

public class ex1hephuogntrinhbac1 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao tong: ");
		double tong=sc.nextDouble(); 
		System.out.println("Nhap vao hieu: ");
		double hieu=sc.nextDouble();
		double x,y;
		x=(tong+hieu)/2;
		y=tong-x;
		System.out.println("gtri x cần tìm là: "+x);
		System.out.println("gtri y cần tìm là: "+y);
	
	}


}
