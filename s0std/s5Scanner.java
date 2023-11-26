package std;

import java.util.Scanner;

public class s5Scanner {
	public static void main(String[] args) {
/*
 	// nhập liệu từ bàn phím
		//scanner hỗ trợ đọc dữ liệu người dùng nhập vào sau đos gán nào biến
		//khởi tạo đó tượng scanner
		Scanner sc = new Scanner(System.in);
		// sc tên đối tượng, system.in cho phép nhập dữ liệu từ bàn phím
		// là đoạn cố định 
		
		//cho phép nhập chuỗi
		System.out.println("mời nhập mật khẩu cấp 1: ");
		String mk1 = sc.nextLine(); //đọc dữ liệu từ bàn phím mà đã nhập mk
		// dùng đối tượng sc đã kb ở trên (scanner) để đọc dưx liệu từ bàn phím
		//sc.nextLine đọc toàn bộ dòng dữ liệu nhập rồi gán vào mk1
		System.out.println("mk cấp 1 là: "+mk1);
		
		//nhập số nguyên
		System.out.println("mời nhập số nguên a: ");
		float a=sc.nextFloat(); //khai báo biến lưu trữ giá trị, gọi đối tượng sc 
		System.out.println("a= "+a); //nhập bàn phím là 5,5 chớ k được 5.5
		
		//nhập chuỗi lần nữa-> dễ bị lỗi
		System.out.println("mời nhập mật khẩu cấp 2: ");
		String mk2 = sc.nextLine();
		System.out.println("mk cấp 2 là: "+mk2);
		*/
		
		
//khai báo riêng cho từng đối tượng mỗi lần nhập để tránh trường hợp bị bỏ qua 1 lần nhập nào đó		
		//cho phép nhập chuỗi
				System.out.println("mời nhập ten: ");
				String ten= new Scanner(System.in).nextLine();
				//k cần câu Scanner...
				System.out.println("tên của bạn là: "+ten);
				
		
		
		
		
		
	}

}
