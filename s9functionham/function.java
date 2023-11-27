package s9functionham;

public class function {

	
		// Hàm trong java
		/*
		 * Khái quát về hàm : Khi muốn thực thi một đoạn code nào nó nhiều lần, thay vì
		 * phải copy đi copy l đoạn code đó, dẫn đến chương trình bị trùng lặp code rất
		 * => Khi đó ta sử dụng hàm • Hàm là 1 khối lệnh thực hiện 1 công việc hoàn
		 * chỉnh (module) Hàm còn được gọi là chương trình con, phương thức, hành vi Hàm
		 * có 2 loại: - Trả về giá trị (có return ) 
		              - Không trã về giá trị: gọi là hàm  thũ tục (procedure) •
		 *  Công dụng : 
		   1. Chia nhỏ phân việc của dự án
		   2. Tội sử dụng bỏi sồn chỉ cần gọi lại chượng trình con guà cuầu ph viết
		 */
		
		//kb hàm có return nên phai rcos kiểu trả về
		
		//          kiểu trả về   tên hàm  đối số(parametter
	//	public static    int        cong(int x, int y) {
	//		return x+y;                  //nguyên nên trả về cũng phải nguyên
	   
		//hàm k có return 
	// public static    void    xinChao(String gioitinh){ 
		       // k có kiểu trả về nên xài void
			
		// tên hàn nên đặt tươừng minh vd TinhGiaiThua()
	
	public static int Cong(int x, int y, int z) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		// băts buộc có return vì có khai báo biến trả về nêếu k thì lỗi
		return x+y+z;
	}
	
	
	// hamf thủ tục
	public static void xinChao(String gioitinh) {
		//chuỗi k thể so sánh kiểu ==
		if(gioitinh.equals("female"))
			System.out.println("xin chào tôi là nhân viên nữ");
		else if (gioitinh.equals("male"))
			System.out.println("xin chào tôi là nhân viên nam");
	}
	
	public static void main(String[] args) {
		int kq= Cong(1, 2, 3);
		System.out.println("tong cac so la: "+kq);
		int kq2= Cong(4, 5, 6);
		System.out.println("tong cac so la: "+kq2);
		
		//gọi hàm xin chào, do k có return neen k gán biến được
		//neen chỉ cânf gọi hàm
		xinChao("male");
		xinChao("female");
		xinChao("lgbt");
		

		
		
		
	}

}
