package s4WhileloopvonglapWhile;

public class s2DoWhile {

	public static void main(String[] args) {
		/* 
		 do {
		 khối lệnh lặp; 
		 }
		 while(điều kiện lặp);
		 */
		//tính tổng từ 1-5
		int a=1;
		int tong=0;
		do {
			tong+=a; //tổng=tổng+a
			a++;
			}
		while (a==5);
		System.out.println("tổng: "+tong);
		//làm những khối lệnh khi a=5
		//nếu a=6 tổng sẽ bằng 6 rồi thoát ctrinh

	}

}
