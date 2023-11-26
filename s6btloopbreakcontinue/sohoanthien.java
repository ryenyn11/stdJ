package s6btloopbreakcontinue;

public class sohoanthien {

	public static void main(String[] args) {
		/* Số hoàn thiện (hay còn gọi là sô hoàn chỉnh, số hoàn hảo hoặc số hoàn thành)
		   là một số nguyên dương mà tổng các ước nguyên dương chính thức của nó 
		   (số nguyên dương bị nó chia hết ngoại trừ nó) bằng chính nó.*/
		//6=1+2+3(6)
				// Tìm tắt cả những số hoàn thiện trong phạm vì từ 1-1000
		
		//tìm ước thực không bằng chính nó
		//ktra số hh
		/*int n=6;
		int tong=0;
		for(int i=1; i<n; i++) {
			if(n%i==0)
				//System.out.print(i+" ");
			tong+=i;
		}
		System.out.println(tong);
		//ktra n có phải là số hh k
		if(tong==n)
			System.out.println(n+" là số hoàn hảo");
		else
			System.out.println(n+"khong phải là số hoàn hảo");*/
			
		
		int tong=0;
		//tìm ước của các số từ 0-1000 không bao gồm chính nó 
		for (int n=1; n<10;n++) {
			for(int i=1; i<n; i++) {
				if(n%i==0) 
					tong+=i;
			}
			//check số hh
			if(tong==n)
				System.out.println(n+" là số hoàn hảo");
			//else
				//continue; //khong phai số hh thì bỏ qua
			}
			
		
			
		
		
		
		
		

	}

}
