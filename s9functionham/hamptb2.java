package s9functionham;

import java.util.Scanner;

public class hamptb2 {
	/*• Viết chương trình giải ptb2 dùng hàm :
1. Tìm nghiệm của ptb2 với : a=1,b=2, c=3
2. Tìm nghiệm của ptb2 với : a=1, b=2, c=1
3. Tìm nghiệm của ptb2 với : a=1, b=2, c=-3

Bước 1: Tính denta=b^2-4ac
Bước 2: So sánh A với 0
• denta <0 => phương trình (1) vô nghiệm
• denta = 0 => phương trình (1) cô nghiệm kép x1 = x2 =-b/2a
• denta > 0 => phương trình (1) có 2 nghiêm phân biệt, ta dùng công thức nghiệm sau:
x1 =(-b + căn denta)/2a
x2=(-b - căn denta)/2a
Mẹo nhâm nghiêm phương trình bác 2 nhanh.
• Nếu a+b+c=0 thì x1 = 1, X2 = c/a
• Nếu a-b+c=0 thì x1 = -1, X2 = -c/a

	 * */
	
	
	      //do trar về chuỗi kết luânj ptrinh vn có nghiem
	public static String TinhPTrinhb2(double a, double b , double c) {
		//nếu a=0 -> pt b1
		if (a==0) {
			if (b==0 && c==0) {
				return "pt bậc nhất có vô số nghiệm"; 
			}
			else if (b==0&& c!=0) {
				return "Pt vô nghiệm";
			}
			else
				return "pt bậc nhất có nghiệm: "+(-c/b);
		}
		else {//pt b2
			double denta=(b*b)-4*a*c;
			if(denta < 0)
				return "pt b2 vo nghiệm";
			else if(denta==0) {
				double x= -b/2*a;
				return "pt b2 có 1 nghiệm kép: x= "+x;
			}
			else {
				double x1=(-b + Math.sqrt(denta))/2*a;
				double x2=(-b - Math.sqrt(denta))/2*a;
				return "pt có 2 nghiệm phân biệt: \n"
						+" x1= "+x1
						+"\n x2= "+x2;
			}
		
			
			
		}
			
		
	}
	 

	public static void main(String[] args) {
		String kq = TinhPTrinhb2(1, 2, 3);
		String kq2 =TinhPTrinhb2(1, 2, 1);
		String kq3 =TinhPTrinhb2(1, 2, -3);
		System.out.println(kq);
		System.out.println(kq2);
		System.out.println(kq3);
		
		//nâng cao cho gnuwoif dùng nhâp a,b,c
		Scanner sc=new Scanner(System.in);
		System.out.println("nhập a: ");
		int a= sc.nextInt();
		System.out.println("nhập b: ");
		int b= sc.nextInt();
		System.out.println("nhập c: ");
		int c= sc.nextInt();
		
		String kq4 = TinhPTrinhb2(a, b, c);
		System.out.println(kq4);

	}

}
