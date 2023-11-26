package s3switchcase;

import java.util.Scanner;

public class Scbienthe {

	public static void main(String[] args) {
		 /* cấu trúc switch case
	     switch (biến cần ktra)
	     ​{
	        case gtri 1:
	        case gt 2:
	        .
	        .
	        .
	        case gt 10:
	           câu lệnh 1;
	           break; thoát ctrinh
	           
	        case gtri 11:
	        câu lệnh 2;
	        break;
	        
	        default:
	           câu lệnh mặc định nếu không thảo mãn tất cả cáe trên;(tương tự else)
	     }
	         */
		Scanner sc= new Scanner(System.in);
		System.out.println("mời nhâp 1 tháng: ");
		int t=sc.nextInt();
		switch (t){
		   case 1:
		   case 3:
		   case 5:
		   case 7:
		   case 8:
		   case 10:
		   case 12:
			   System.out.println("thang "+ t+ " có 31 ngày");
			   break;
		   case 4:
		   case 6:
		   case 9:
		   case 11:
			   System.out.println("thang "+ t+ " có 30 ngày");
			   break;
		   case 2: 
			   System.out.println("thang "+ t+ " có 28 hoặc 29 ngày");
			   break;
		  default:
			  System.out.println("tháng không hợp lệ, xin hãy nhập lại");
			  break;
			
		
		}

	}

}
