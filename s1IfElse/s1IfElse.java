package s1IfElse;

import java.util.Scanner;

public class s1IfElse {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		double dtb= sc.nextDouble();
		if(dtb>=8.0 && dtb<10) {
			System.out.println("Chúc mừng bạn ");
			System.out.println("Là hsg");
		}	//nêsy 2 lệnh trở lên thì nên bỏ vô block
		else if(dtb>=7) {
			System.out.println("hsk");
		}
		else {
			System.out.println("hstb");
		}
	
	}
}
