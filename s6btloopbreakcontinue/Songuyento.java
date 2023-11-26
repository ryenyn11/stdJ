package s6btloopbreakcontinue;

import java.util.Scanner;

public class Songuyento {

	public static void main(String[] args) {
		/*Viết chương trình nhập nhập số nguyên a> 0 từ bàn phím
Cho biết đó có phải số ng tổ
( số ng tố là số >1, và chỉ chia hết cho 1 và chính nó )
/ Kết thúc chương trình hỏi người dùng: Bạn có muốn tiếp tục sử dụng
phần mềm không? Nếu chọn không thì thoát ctrinh*/
		
		/*Scanner sc= new Scanner(System.in);
		System.out.println("nhap n= ");
		int n = sc.nextInt();
		int m;
		while (n<=0){
			System.out.println("nhập lai n, n>0");
			n = sc.nextInt();
			}
		System.out.println("bạn đã nhập thành công, n= "+n);
		int demUoc=0;
		for (int i=1; i<=n; i++) {
			if (n%i==0)
				demUoc++;
		}
		if (demUoc==2)
			System.out.println(n+" là số nguyên tố");
		else
			System.out.println(n+" không phải là số nguyên tố");
			*/
		Scanner sc= new Scanner(System.in);
		while(true) { //vòng lặp vĩnh cửu để làm thoát ctrinh
			System.out.println("nhap n= ");
			int n = sc.nextInt();
			
			while (n<=0){
				System.out.println("nhập lai n, n>0");
				n = sc.nextInt();
				}
			System.out.println("bạn đã nhập thành công, n= "+n);
			int demUoc=0;
			for (int i=1; i<=n; i++) {
				if (n%i==0)
					demUoc++;
			}
			if (demUoc==2)
				System.out.println(n+" là số nguyên tố");
			else
				System.out.println(n+" không phải là số nguyên tố");
			System.out.println("ban có muốn thoát chương trình không?(nhấn y để thoát)");
			String traLoi= new Scanner(System.in).nextLine();
			if(traLoi.equals("y")||traLoi.equals("Y")) //nếu nhập vào y thì thoát
				break;
		}
		
					
		}

}
