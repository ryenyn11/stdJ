package s6btloopbreakcontinue;

public class tét {
	public static void main(String[] args) {
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
