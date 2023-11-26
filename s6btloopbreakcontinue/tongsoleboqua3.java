package s6btloopbreakcontinue;

import java.util.Scanner;

public class tongsoleboqua3 {

	public static void main(String[] args) {
		// Viết chương trình tính tổng các số lẽ từ 1 đến n, n nhập từ hàn phím
		//Nhập n = 7, Bỏ qua không cộng tổng với số 3 => in ra kết quả
				//(gợi ý đáp án : 1+5+7 =13)
				//Thử break khi vòng lặp chạy đến giá trị n=3
		Scanner sc= new Scanner(System.in);
		System.out.println("nhập n= ");
		int n= sc.nextInt();
		int tong=0;
		
		for(int i=1; i<=n; i+=2) {
			if(i==3)
				continue;//bỏ qua gtri
			    //break; //thoát vòng lặp
			else
				tong+=i;	
		}
		System.out.println("tong= "+tong);
		
	}

}
