package std;

public class s3Epkieudulieu {
	public static void main(String[] args) {
//Ép kiẻue dữ liệu
	//trogn quá trình tính toán, kiểu dữ liệu trả về không còn giống vs kiểu ban đầu
	//=> ép kiểu dữ liệu để sử dụng phù hợp
	  //
	int a=2;
	 int b=4;
	 double kq=a/b;
	 System.out.println(kq);
	 // kq bằng 0.0 do int/int chỉ lấy phần nguyên nên kq trả về bằng 0.0
	 //ép kiểu rộng: ép từ bé => lớn: không lo mất dữ liệu
	   //int->long->float->double
	 //
	 double dapAn= (double)a/b; 
	 System.out.println(dapAn);
	 //kq bằng 0.5 do ép kiểu a từ int => double nên thành double/int
	 
	 //ép kiểu hẹp: ép từ lớn=> bé: có thể mất dữu liệu
	 int c=128;
	 byte d=(byte)c;
	 System.out.println(d);
	 //=> b không nằm trog giới hạn của kiểu byte nên d  khác b nên sai dữ liệu
	 System.out.println("min của kiểu byte= "+Byte.MIN_VALUE);
	 System.out.println("max của kiểu byte= "+Byte.MAX_VALUE);
	 int e=15;
	 byte f= (byte)e;
	 System.out.println(f);
	//=> e nằm trog giới hạn của kiểu byte nên e=f nên đúng dữ liệu
	 
	 

	}
}
