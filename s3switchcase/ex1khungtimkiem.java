package s3switchcase;

import java.util.Scanner;

public class ex1khungtimkiem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" 1.Tìm theo tên \n 2.Tìm theo tác giả \n 3.Tìm theo nhà xuất bản \n 4. Tìm theo tên tiêu đề \n Mời bấm số để chọn: ");
		int so=sc.nextInt();
		switch (so) {
		   case 1:
			   System.out.println("tìm theo tên");
			   break;
		   case 2:
			   System.out.println("tìm theo tác giả");
			   break;
		   case 3:
			   System.out.println("tìm theo nhà xuất bản");
			   break;
		   case 4:
			   System.out.println("tìm theo tên tiêu đề");
			   break;
		   default:
			   System.out.println("lệnh không hợp lệ, xin hãy nhập lại");
			   break;
				   
			   
			   
		
			   
		}

	}

}
