package std;

import java.util.Scanner;

public class s6MATHchamPI {

	public static void main(String[] args) {
//	Scanner sc= new Scanner(System.in);//để có thể nhập dữ liệu từu bàn phím
//		System.out.println("Nhập vào bán kính hình tròn r: ");
//		double r=sc.nextDouble();
//		double cv = 2*Math.PI*r;
//		double dt= Math.PI*Math.pow(r, 2);
//		System.out.println("chu vi là: "+cv);
//		
		System.out.println("nhập vào chiều dài a: ");
		double a= new Scanner(System.in).nextDouble();
		double dt=a*a;
		System.out.println("dt là "+dt);
	}

	

}
