package s9functionham;

import java.util.Scanner;

public class pheptinh {
	/*public static void phepTinh(double a, double b, String phepToan) {
		double kq=0;
		/*
		try {
			if (phepToan.equals("+")) {
				kq= a+b;
				System.out.println(kq);
				} 
			else if (phepToan.equals("-")) {
				kq= a-b;
				System.out.println(kq);
			    }
			else if(phepToan.equals("*")) {
				kq=a*b;
				System.out.println(kq);
			    }
			else if(phepToan.equals("/")) {
				if(b!=0) {
			  kq= a/b;
			  System.out.println(kq);
			  }
			else 
				System.out.println("mẫu phải khác 0");
			}
		} 
		catch (ArithmeticException ex) {
			System.out.println("lỗi phép tính");
			ex.printStackTrace();
		}
		
		
		
		switch (phepToan) {
		case "+" : {
			kq= a+b;
			System.out.println(kq);
		}
		case "-" : {
			kq= a-b;
			System.out.println(kq);
		}
		case "*" : {
			kq= a*b;
			System.out.println(kq);
		}
		case "/" : {
			if(b!=0) {
			  kq= a/b;
			  System.out.println(kq);
			  }
			else 
				System.out.println("mẫu phải khác 0");
		}
		
		default:
			System.out.println("nhập sai phep toán");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập a=");
		double a=sc.nextDouble();
		System.out.println("nhập b=");
		double b=sc.nextDouble();
		System.out.println("nhập phép toán + - * /:");
		String phepToan = new Scanner(System.in).nextLine();
		System.out.println(a+phepToan+b+"\n=");
		phepTinh(a, b, phepToan);

	}
	*/
		public static void Cong(double a, double b) {
			double kq= a+b;
			System.out.println(kq);
		}
		public static void Tru(double a, double b) {
			double kq= a-b;
			System.out.println(kq);
		}
		public static void Nhan(double a, double b) {
			double kq= a*b;
			System.out.println(kq);
		}
		public static void Chia(double a, double b) {
			if(b!=0) {
				 double kq= a/b;
				  System.out.println(kq);
				  }
				else 
					System.out.println("mẫu phải khác 0");
		}
		public static void main(String[]arg) {
			Scanner sc=new Scanner(System.in);
			System.out.println("nhập a=");
			double a=sc.nextDouble();
			System.out.println("nhập b=");
			double b=sc.nextDouble();
			System.out.println("nhập phép toán + - * /:");
			String phepToan = new Scanner(System.in).nextLine();
			switch(phepToan) {
			case "+":
				Cong(a, b);
				break;
			case "-":
				Tru(a, b);
				break;
			case "*":
				Nhan(a, b);
				break;
			case "/":
				Chia(a, b);
				break;
			default: System.out.println("nhập sai phép toán");
				
			}
			
		}

}
