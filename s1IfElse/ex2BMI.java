package s1IfElse;

import java.util.Scanner;

public class ex2BMI {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		double cao, nang, BMI;
		System.out.println("nhập chiều cao của bạn: ");
		cao= sc.nextDouble();
		System.out.println("nhâp cân nặng cuar bạn: ");
		nang= sc.nextDouble();
		BMI= nang/(Math.pow(cao, 2));
		System.out.println("BMI là: "+BMI);
		if(BMI<15) {
			System.out.println("Thân hình quá gầy");
		}
		else if(BMI<16) {
			System.out.println("Thân hình gầy");
		
		}
		else if(BMI<18.5) {
			System.out.println("Thân hình ");
		}
		else if(BMI<25) {
			System.out.println("Thân hình bình thường");
		}
		else if(BMI<30) {
			System.out.println("Thân hình hơi béo");
		}
		else if(BMI<35) {
			System.out.println("Thân hình béo");
		}
		else {
			System.out.println("Thân hình quá béo");
		}
		
	}

	

}
