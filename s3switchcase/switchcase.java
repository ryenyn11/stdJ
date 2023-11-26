package s3switchcase;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /* cấu trúc switch case
     switch (biến cần ktra)
​{
   case gtri 1:
      câu lệnh 1;
     break; thoát ctrinh
   case gt 2:
      câu lệnh 2;
     break;
   .
   .
   .
   default:
      câu lệnh mặc định nếu không thảo mãn tất cả cáe trên;(tương tự else)
      break;
}
    */
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhập 1 số nguyên: ");
		int n=sc.nextInt();
		int div=n%2;
		switch (div){
		case 0:
			System.out.println(n+ " là số chẵn");
			break;
		default:
			System.out.println(n+ " là số lẻ");	 
			break;
		}
		

		
	}

}
