package std;

public class s2Bien {
	public static void main(String[] args) {
	//khai báo biến(không gán gt)/ khởi tạo biến (có gán gtri) 
//	1.có thể thay đổi giá trị: [kiểu dữ liệu] tên_biến [=giá_trị];
	int a;
	byte tuoi;
	float diemToan;
	//khai báo nhiều kiểu cùng lúc
	int x,y,z;
	//khởi tạo
	int gia =10;
	float diemVan= 9.5f; //k có f thì auto double
	System.out.println(gia);
	gia=20;
	System.out.println(gia);
//float cần thêm f
	
//	2.không cho phép thay đổi gtri (hằng số): final [kiểu dữ liệu] tên_biến [=giá trị]
	//hằng số thường viết hoa hết
	final int DODAI =200;
	//DODAI=100;=> báo lỗi
	
/*quy tắc đặt tên
  chứa a-z,A-Z; 0-9 và dấu gạch chân_;và dấu4
  không bắ đầu bằng số
  không trùng với khoá riêng của JAVA
  phân biệt hoa /thường nhưng k nên vì dễ nhầm
  hằng số viết hoa hết
  tuân thủ theo quy ước đặt tên cannelCase: lạc Đà (chữ cái t2 trở đi viết hoa, clai viết thường)
  ex: int tuoiCon =12;*/
	}
}
