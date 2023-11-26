package s6btloopbreakcontinue;

public class breakcontinute {
	public static void main(String[]arg) {
		//tính tổng từ 1-5 =1+2+3+4+5=15
		/*
		 * int tong=0; 
		 * for(int i=0; i<=5; i++) 
		 *  tong+=i; 
		 * System.out.println("tong= "+tong);
		 */
		
		//continue bỏ qua 1 hoặc vài gía trị( bỏ qua 1 bước lặp)
		//tính tổng từ  1-5 bỏ qua số 3 =1+2+4+5=12
		int tong=1;
		for(int i=0; i<=5; i++) {
			if(i==3) //nếu i=3 bỏ qua số 3
				continue;
			else //không thì tổng= tổng+i
			 tong+=i; 
			 }
		System.out.println("tong= "+tong);
		
		//break thoát vòng lặp, dừng ngắt vòng lặp ở 1 đoạn nào đó
		//in số từ 0-99
		/*int n=0;
		  while(n<100) {
			System.out.println("n= "+n);
			n++;*/
		
		int n=0;
		  while(n<100) {
			System.out.println("n= "+n);
			if(n==15) { //khi n chạy tới 15 kết thúc vòn lặp
				break;
			}
			n++;
		}
	}
	

}
