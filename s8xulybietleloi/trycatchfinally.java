package s8xulybietleloi;

public class trycatchfinally {

	public static void main(String[] args) {
	/* //cú pháp
		try {// bỏ code nghĩ là lỗi vô
			
		}
		catch(Exception ex) {//bắt lỗi
			ex.printStackTrace();//in lỗi khi run
		}
		finally{ } cho dù có lỗi hay k thì đều vẫn thực hiện
		ex neếu có lỗi out tài khoản, không lõi cũng out tài khoản
*/
	/*	int a=10;
		int b=0;
		int c=a/b;
		System.out.println("c= "+c);
		System.out.println("các "+ "đoạn code khác");*/
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at tuhocJAVA/s8xulybietleloi.trycatch.main(trycatch.java:16) lỗi ở dong 16
		//chương trình sẽ bị nagwts ngay ở dòng 16, để tránh ảnh hưởng tới code phía sau thì xài trycatch
		// không bị đứt ngang chương trình
		//lỗi thì bắt, không lỗi run bth
		int a=10;
		int b=0;
		
		try {
			int c=a/b; //lỗi cia cho 0
			System.out.println("c= "+c);
		} 
		// nếu dự đoán được đó là lỗi toán học thì xài 
		/* ArithmeticException là một loại ngoại lệ trong Java được
           ném ra khi một điều kiện toán học bất thường xảy ra.
            Nó là một lớp con của lớp Runtime Exception, có rất nhièu lỗi
            nếu k dự đoán được thì cứ xài Êception để k bị sót lỗi
		  */
		catch (ArithmeticException ex) {
			System.out.println("có lỗi toán học gòyyy");
			ex.printStackTrace();
		} //nếu có lỗi toán học thì se dừng ở đây
		//nếu k bắt đưỡ lỗi toán học thì mớii thực hiện catch dưới
		catch (Exception ex) {
			System.out.println("có lỗi rồi!!");
			ex.printStackTrace();
		}
		finally {
			System.out.println("có lỗi hay khôg đêù làm");
			
		}
		System.out.println("các đoạn code khác");
	}

}
