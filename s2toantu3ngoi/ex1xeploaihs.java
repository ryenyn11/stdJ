package s2toantu3ngoi;

import java.util.Scanner;

public class ex1xeploaihs {

	public static void main(String[] args) {
		//biến= bthuc 1 ? bthuc 2:(bt1' ? bthuc2':bbthuc 3;
		Scanner sc= new Scanner(System.in);
		System.out.println("mời bạn nhập điểmt trung bình: ");
		double tb=sc.nextDouble();
		String xeploai= (tb>=8)? "giỏi":((tb<8 && tb>=6.5)?"Khá":(tb<6.5 && tb>=5)?"Trung bình":"Yếu");
		System.out.println("Xếp loại của bạn là: "+xeploai);
		/*String xeploai= (tb>=8)? "giỏi":
		  ((tb<8 && tb>=6.5)?"Khá":
			(tb<6.5 && tb>=5)?"Trung bình":"Yếu");
			*/
	}

}
