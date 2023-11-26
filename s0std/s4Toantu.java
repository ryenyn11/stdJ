package std;

public class s4Toantu {

	public static void main(String[] args) {
		int a=5, b=10;
		//c1
		System.out.println("a+b= "+(a+b));
		//c2
		int kq= a+b;
		System.out.println(kq);
		// lưu ý: chú ý phép chia
		//nếu tử nhỏ hơn mẫu nên ép kiểu để tránh sai số
		
		System.out.println("a/b= "+(a/b));
		System.out.println("a/b= "+((double)a/b));

		
		
	//Toán tử gán
		int x=8;
		x+=5; //<=> x=x+5;
		System.out.println("x= "+x);
		int y=3;
		y-=5; //<=> x=x-5;
		System.out.println("y= "+y);
		int z=20;
		z*=5;
		System.out.println(z);
		int w=40;
		z/=5;
		System.out.println(w);
		
		//phép so sánh
		System.out.println(a==b);
		System.out.println(a!=b); //khác: a có khác b k
		System.out.println(a<b);
		System.out.println(a>b);
	    System.out.println(a<=b);
	    System.out.println(a>=b);
		//đúng thì in tra true, sai in ra false
	    
 //toán tử logic trả về true hoặc false

	/*
	 * && (and) trả về true khi cả 2 ĐỀU đúng 
	 * true true - true 
	 * true false - false
	 * false true - false 
	 * false false - false

	 * || (or) trả về true khi 1 trong 2 đúng 
	 * true false - true 
	 * false true -true
	 * false false - false 
	 
	 *   ! (phủ định) đảo true -> false, false-> true
	 */
	    int i=11;
	    System.out.println(i>0 && i<10);
	    System.out.println(i>0 || i<10);
	    System.out.println(!(i>0 || i<10));
	    
//toán tử tiền tố (prefix), hâu tố(postfix)
	    //++ tăng, -- giảm
	    //viết trước hay sau biêns đều được
	    int k=100, l=200, m=300, n=400;
	    k++;
	    ++l;
	    System.out.println(k);
	    System.out.println(l);
	    System.out.println(m--);//sai huhu
	    System.out.println(--n);
	    
	    // thứ tự
	    /*1. prefix
	    2. các phép toán clai +-,..
	    3. gán giá trị cho biến ở bên trái dấu bằng
	    4. postfix*/
	    //ex
	    int A=1, B=2, C;
	    C= A++ - ++B +1;// tính sai thì ra 2-3+1=0
	    System.out.println(A);
	    System.out.println(B);
	    System.out.println(C);
	    // 1++ -3 +1 = -1; a=1++=2
	    //1. b=3; 2. 1-3+1= -1, 3.c=-1, 4. a=2 step
	   
	    

	    
	    
	    
	    
	}

}
