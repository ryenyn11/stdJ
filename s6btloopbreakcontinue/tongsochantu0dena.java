package s6btloopbreakcontinue;

import java.util.Scanner;

public class tongsochantu0dena {

	public static void main(String[] args) {
		// nhập n tính tổng ác số chăn từ 0-n 0 2 4 6 8
		// nêu số lẽ in ra "tôi hong tính tổng số lẻ, bye bye" và thoát chương trình
     Scanner sc= new Scanner(System.in); //nhập n vào từ bp
     System.out.println("nhập n= ");
     int n = sc.nextInt();
     int tong=0;
    	 if(n%2!=0) {
    		 System.out.println("tôi hong tính tổng số lẻ, bye bye");
    	 }
    	 else {
    		 for(int i=0; i<=n; i+=2) {
    		     tong+=i; 
    	 }
     System.out.println("tổng từ 0-n= "+tong);
    	 } 
	}

}
